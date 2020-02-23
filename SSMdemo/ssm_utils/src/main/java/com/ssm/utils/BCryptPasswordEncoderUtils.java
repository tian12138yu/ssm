package com.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author tjy
 * @Date 2020/2/7 20:05
 */

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    public static String encode(String password){
        password=bCryptPasswordEncoder.encode(password);
        return password;
    }

    public static void main(String[] args) {
        System.out.println(encode("132"));
    }
}
