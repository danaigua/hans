package com.hengyue.hans.service.impl;

import com.hengyue.hans.dao.ProductDao;
import com.hengyue.hans.entity.Product;
import com.hengyue.hans.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 章家宝
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;


    @Override
    public List<Product> listAll() {
        return productDao.listAll();
    }

    @Override
    public List<Product> listByPage(Map<String, Object> map) {
        return productDao.listByPage(map);
    }
}
