package com.hengyue.hans.service.impl;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hengyue.hans.entity.User;
import com.hengyue.hans.service.TokenService;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * 令牌业务层接口实现类
 * @author 章家宝
 */
@Service("tokenService")
public class TokenServiceImpl implements TokenService {


    @Override
    public String getToken(User user, long ttlMillis) {
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        String token = "" ;
        try {
            token= JWT.create().withIssuedAt(now).withAudience(user.getId() + "")
                    .sign(Algorithm.HMAC256(user.getPassword()));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return token;
    }
}
