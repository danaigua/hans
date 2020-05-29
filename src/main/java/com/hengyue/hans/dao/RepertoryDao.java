package com.hengyue.hans.dao;

import com.hengyue.hans.entity.Repertory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 库存持久层接口
 * @author 章家宝
 */
@Mapper
public interface RepertoryDao {

    /**
     *
     * @return
     */
    public List<Repertory> listAll();

    /**
     * 分页查询库存商品
     * @return
     */
    public List<Repertory> listByPage(Map<String, Object> map);
}
