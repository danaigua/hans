package com.hengyue.hans.service;

import com.hengyue.hans.entity.FinancialRegistration;

import java.util.List;
import java.util.Map;

/**
 * 财务登记业务层接口
 * @author 章家宝
 */
public interface FinancialRegistrationService {

    /**
     * 列出所有的财务登记
     * @return
     */
    public List<FinancialRegistration> listAll();

    /**
     * 分页查询财务登记
     * @return
     */
    public List<FinancialRegistration> listByPage(Map<String, Object> map);
}
