package com.hengyue.hans.service.impl;

import com.hengyue.hans.dao.LikenessProductDao;
import com.hengyue.hans.entity.LikenessProduct;
import com.hengyue.hans.service.LikenessProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *类似商品业务层接口
 * @author 章家宝
 */
@Service("likenessProduct")
public class LikenessProductServiceImpl implements LikenessProductService {

    @Resource
    private LikenessProductDao likenessProductDao;


    @Override
    public List<LikenessProduct> listByPage(Map<String, Object> map) {
        return likenessProductDao.listByPage(map);
    }

    @Override
    public List<LikenessProduct> listAll() {
        return likenessProductDao.listAll();
    }
}
