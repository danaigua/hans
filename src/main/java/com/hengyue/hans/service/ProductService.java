package com.hengyue.hans.service;


import com.hengyue.hans.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * 产品业务层接口
 * @author 章家宝
 */
public interface ProductService {
    /**
     * 列出所有的产品
     * @return
     */
    public List<Product> listAll();

    /**
     * 分页查询出商品信息
     * @param map
     * @return
     */
    public List<Product> listByPage(Map<String, Object> map);
}
