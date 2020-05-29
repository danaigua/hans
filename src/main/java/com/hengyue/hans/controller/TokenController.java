package com.hengyue.hans.controller;

import com.auth0.jwt.JWT;
import com.hengyue.hans.annotation.UserLoginToken;
import com.hengyue.hans.entity.User;
import com.hengyue.hans.service.TokenService;
import com.hengyue.hans.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * jwt token控制层接口
 * @author 章家宝
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    @Resource
    private TokenService tokenService;

    @Resource
    private UserService userService;

    /**
     * 刷新令牌
     * 10分钟刷新一次
     * @param token
     * @return
     */
    @UserLoginToken
    @PostMapping("/refreshToken/{token}")
    public Map<String, Object> refreshToken(@PathVariable String token){
        Map<String, Object> map = new HashMap<>(16);
        String userId;
        List<String> audience = JWT.decode(token).getAudience();
        userId = audience.get(0);
        User user = userService.getByUserId(Integer.parseInt(userId));
        token = tokenService.getToken(user, 36000000);
        map.put("success", true);
        map.put("token", token);
        return map;
    }
}
