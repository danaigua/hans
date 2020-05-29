package com.hengyue.hans.dao;

import com.hengyue.hans.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 章家宝
 */
@Mapper
public interface ProductDao {

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
