package com.hengyue.hans.service;

import com.hengyue.hans.entity.LikenessProduct;

import java.util.List;
import java.util.Map;

/**
 * @author 章家宝
 */
public interface LikenessProductService {

    /**
     * 分页查询类似商品
     * @param map
     * @return
     */
    public List<LikenessProduct> listByPage(Map<String, Object> map);
    /**
     * 查询所有类似商品
     * @param map
     * @return
     */
    public List<LikenessProduct> listAll();
}
