package org.baoshan.userservice.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BPwdEncoderUtil {

    private static final PasswordEncoder ENCODER = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    private static final BCryptPasswordEncoder bc=new BCryptPasswordEncoder();

    public static String BCryptPassword(String password) {
        return  bc.encode(password);
        //return ENCODER.encode(password);
    }

    public static boolean matches(CharSequence rawPassword, String encodedPassword) {
        //return ENCODER.matches(rawPassword, encodedPassword);
        return bc.matches(rawPassword,encodedPassword);
    }
}
