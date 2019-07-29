package org.baoshan.userservice.feign;

import org.baoshan.userservice.entity.ao.JWT;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="oauth-service",fallback = AuthServiceClientHystrix.class)
public interface AuthServiceClient {

    @PostMapping(value ="/oauth/token")
    JWT getToken(@RequestHeader(value="Authorization")String authorization,
                 @RequestParam("grant_type")String type,
                 @RequestParam("username")String username,
                 @RequestParam("password")String password);
}
