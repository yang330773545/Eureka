package org.baoshan.userservice.controller;

import org.baoshan.userservice.entity.po.User;
import org.baoshan.userservice.entity.dto.UserLoginDTO;
import org.baoshan.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @PostMapping("/register")
    public User postUser(@RequestParam("username")String username, @RequestParam("password")String password){
        return userService.insertUser(username, password);
    }

    @PostMapping ("/login")
    public UserLoginDTO login(@RequestParam ("username")String username, @RequestParam ("password")String password){
        return userService.login(username, password);
    }


}
