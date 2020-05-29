package com.hengyue.hans.service;


import com.hengyue.hans.entity.User;

/**
 *令牌业务层接口
 * @author 章家宝
 */
public interface TokenService {

    public String getToken(User user, long ttlMillis);
}
