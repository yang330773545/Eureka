package org.baoshan.userservice.service;

import org.baoshan.userservice.entity.ao.JWT;
import org.baoshan.userservice.entity.dto.UserLoginDTO;
import org.baoshan.userservice.entity.po.User;
import org.baoshan.userservice.feign.AuthServiceClient;
import org.baoshan.userservice.repository.UserRepository;
import org.baoshan.userservice.utils.BPwdEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthServiceClient client;

    public User insertUser(String username, String password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(BPwdEncoderUtil.BCryptPassword(password));
        return userRepository.save(user);
    }

    public UserLoginDTO login(String username, String password){
        User user=userRepository.findByUsername(username);
        if(user==null){
            throw new RuntimeException("用户不存在");
        }
        if(!BPwdEncoderUtil.matches(password, user.getPassword())){
            throw new RuntimeException("用户密码不对");
        }
        //dXNlci1zZXJ2aWNlOjEyMzQ1Ng== 是 user-service:123456的 base64编码 Basic
        JWT jwt=client.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        if(jwt==null){
            throw new RuntimeException("用户Token有问题");
        }
        UserLoginDTO dto=new UserLoginDTO();
        dto.setUser(user);
        dto.setJwt(jwt);

        return dto;
    }
}
