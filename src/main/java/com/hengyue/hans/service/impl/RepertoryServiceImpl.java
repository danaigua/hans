package com.hengyue.hans.service.impl;

import com.hengyue.hans.dao.RepertoryDao;
import com.hengyue.hans.entity.Repertory;
import com.hengyue.hans.service.RepertoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * 库存商品业务层接口
 * @author 章家宝
 */
@Service("repertoryService")
public class RepertoryServiceImpl implements RepertoryService {

    @Resource
    private RepertoryDao repertoryDao;


    @Override
    public List<Repertory> listAll() {
        return repertoryDao.listAll();
    }

    @Override
    public List<Repertory> listByPage(Map<String, Object> map) {
        return repertoryDao.listByPage(map);
    }
}
