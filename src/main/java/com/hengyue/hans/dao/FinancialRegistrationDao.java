package com.hengyue.hans.dao;

import com.hengyue.hans.entity.FinancialRegistration;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 财务登记持久层接口
 * @author 章家宝
 */
@Mapper
public interface FinancialRegistrationDao {

    /**
     * 列出所有的财务登记
     * @return
     */
    public List<FinancialRegistration> listAll();

    /**
     * 分页查询财务登记
     * @param map
     * @return
     */
    public List<FinancialRegistration> listByPage(Map<String, Object> map);

}
