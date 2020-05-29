package com.hengyue.hans.service.impl;

import com.hengyue.hans.dao.UserDao;
import com.hengyue.hans.entity.User;
import com.hengyue.hans.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 章家宝
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }

    @Override
    public User listByTelephone(String telephone) {
        return userDao.listByTelephone(telephone);
    }

    @Override
    public User getByUserId(Integer userId) {
        return userDao.getByUserId(userId);
    }
}
