package com.hengyue.hans.utils;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

/**
 * jwt令牌工具类
 * @author 章家宝
 */
public class JwtUtils {
    private JwtUtils (){}

    private JwtUtils jwtUtils = new JwtUtils();

    public static JwtUtils build(){
        return new JwtUtils();
    }

}
