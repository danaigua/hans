package com.hengyue.hans.controller;

import com.hengyue.hans.annotation.UserLoginToken;
import com.hengyue.hans.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 产品控制层接口
 */
@RestController
@RequestMapping("/admin/product")
public class ProductController {

    @Resource
    private ProductService productService;

    /**
     * 分页列出所有的商品
     * @param page
     * @param limit
     * @return
     */
    @PostMapping("/list")
    @UserLoginToken
    public Map<String, Object> list (
            @RequestParam(value = "page", required = false)Integer page,
            @RequestParam(value = "limit", required = false)Integer limit){
        Map<String, Object> map = new HashMap<>(16);
        Map<String, Object> paramMap = new HashMap<>(3);
        paramMap.put("page", page - 1);
        paramMap.put("limit", limit);
        map.put("data", productService.listByPage(paramMap));
        map.put("count", productService.listAll().size());
        map.put("code", 0);
        map.put("msg", "");
        productService.listAll();
        return map;
    }

}
