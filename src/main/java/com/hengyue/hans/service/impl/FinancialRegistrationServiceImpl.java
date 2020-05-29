package com.hengyue.hans.service.impl;

import com.hengyue.hans.dao.FinancialRegistrationDao;
import com.hengyue.hans.entity.FinancialRegistration;
import com.hengyue.hans.service.FinancialRegistrationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 财务登记业务层接口实现类
 * @author 章家宝
 */
@Service("financialRegistrationService")
public class FinancialRegistrationServiceImpl implements FinancialRegistrationService {

    @Resource
    private FinancialRegistrationDao financialRegistrationDao;

    @Override
    public List<FinancialRegistration> listAll() {
        return financialRegistrationDao.listAll();
    }

    @Override
    public List<FinancialRegistration> listByPage(Map<String, Object> map) {
        return financialRegistrationDao.listByPage(map);
    }
}
