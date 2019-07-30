package org.baoshan.userservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestAuthController {

    //heard中加入 Authorization：Bearer +access_token
    @RequestMapping(value="/look")
    public String look(){
        return "你已经登录";
    }

    @RequestMapping(value="/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String admin(){
        return "你有admin权限";
    }

    @RequestMapping("/getPrincipal")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oauth2Authentication, Principal principal, Authentication authentication){
        System.out.println("====================================");
        System.out.println(oauth2Authentication);
        System.out.println(principal);
        System.out.println(authentication);
        System.out.println("====================================");
        return oauth2Authentication;
    }
}
