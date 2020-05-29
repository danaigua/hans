package com.hengyue.hans.dao;

import com.hengyue.hans.entity.ProductType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 章家宝
 */
@Mapper
public interface ProductTypeDao {

    /**
     * 列出所有的产品类型
     * @return
     */
    public List<ProductType> listAll();

    /**
     * 分页查询产品类别
     * @param map
     * @return
     */
    public List<ProductType> listByPage(Map<String, Object> map);


}
