package com.hengyue.hans.service.impl;

import com.hengyue.hans.dao.ProductTypeDao;
import com.hengyue.hans.entity.ProductType;
import com.hengyue.hans.service.ProductTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 章家宝
 */
@Service("productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {

    @Resource
    private ProductTypeDao productTypeDao;


    @Override
    public List<ProductType> listAll() {
        return null;
    }
}
