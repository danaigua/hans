package com.hengyue.hans.service;

import com.hengyue.hans.entity.Repertory;

import java.util.List;
import java.util.Map;

/**
 * 库存商品数量
 * @author 章家宝
 */
public interface RepertoryService {

    /**
     *列出所有的库存商品
     * @return
     */
    public List<Repertory> listAll();

    /**
     * 分页查询库存商品
     * @return
     */
    public List<Repertory> listByPage(Map<String, Object> map);
}
