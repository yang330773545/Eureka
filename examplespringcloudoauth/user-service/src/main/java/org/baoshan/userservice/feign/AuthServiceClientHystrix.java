package org.baoshan.userservice.feign;

import org.baoshan.userservice.entity.ao.JWT;
import org.springframework.stereotype.Component;


@Component
public class AuthServiceClientHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        // TODO Auto-generated method stub
        System.out.println("熔断调用");
        return null;
    }
}
