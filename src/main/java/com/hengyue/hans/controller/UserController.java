package com.hengyue.hans.controller;

import com.hengyue.hans.entity.User;
import com.hengyue.hans.service.TokenService;
import com.hengyue.hans.service.UserService;
import com.hengyue.hans.utils.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户控制层接口
 * @author 章家宝
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private TokenService tokenService;

    /**
     * 登录接口
     * @return
     */

    @PostMapping("/login/{telephone}/{password}")
    public Map<String, Object> login(@PathVariable String telephone, @PathVariable String password) {
        Map<String, Object> map = new HashMap<>(16);
        User user = null;
        if(StringUtils.isNotEmpty(telephone)){
            user = userService.listByTelephone(telephone);
        }
        if(user != null){
            if(StringUtils.isNotEmpty(password) && StringUtils.isNotEmpty(user.getPassword()) && user.getPassword().equals(password)){
                String token = tokenService.getToken(user, 360000);
                map.put("success", true);
                map.put("token", token);
            }else{
                map.put("errorInfo","用户密码错误");
                map.put("success", false);
            }
        }else{
            map.put("errorInfo","用户不存在");
            map.put("success", false);
        }
        return map;
    }

}
