package com.hengyue.hans.dao;

import com.hengyue.hans.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户持久层接口
 * @author 章家宝
 */
@Mapper
public interface UserDao {

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
     * 根据用户id获取实体
     * @param userId
     * @return
     */
    public User getByUserId(Integer userId);
}
