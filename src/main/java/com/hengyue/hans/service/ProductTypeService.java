package com.hengyue.hans.service;

import com.hengyue.hans.entity.ProductType;

import java.util.List;

/**
 * 产品类型业务层接口
 * @author 章家宝
 */
public interface ProductTypeService {
    /**
     * 列出所有的产品
     * @return
     */
    public List<ProductType> listAll();
}
