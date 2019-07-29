package org.baoshan.userservice.entity.dto;

import lombok.Data;
import org.baoshan.userservice.entity.po.User;
import org.baoshan.userservice.entity.ao.JWT;

@Data
public class UserLoginDTO {
    private User user;
    private JWT jwt;
}
