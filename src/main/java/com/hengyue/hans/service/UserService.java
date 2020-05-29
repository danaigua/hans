package com.hengyue.hans.service;

import com.hengyue.hans.entity.User;

import java.util.List;

/**
 * 用户业务层接口
 * @author 章家宝
 */
public interface UserService {
    /**
     * 列出所有的用户
     * @return
     */
    public List<User> listAll();

    /**
     * 通过电话查找用户实体
     * @param telephone
     * @return
     */
    public User listByTelephone(String telephone);

    /**
     * 通过用户id获取实体
     * @param userId
     * @return
     */
    public User getByUserId(Integer userId);
}
