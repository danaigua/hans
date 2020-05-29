package com.hengyue.hans.controller;

import com.hengyue.hans.service.LikenessProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 类似商品控制层接口
 * @author 章家宝
 */
@RestController
@RequestMapping("/admin/likenessProduct")
public class LikenessProductController {

    @Resource
    private LikenessProductService likenessProductService;

    /**
     * 分页查询所有类似商品
     * @param page
     * @param limit
     * @return
     */
    @PostMapping("/list")
    public Map<String, Object> list(
            @RequestParam(value = "page", required = true) Integer page,
            @RequestParam(value = "limit", required = true) Integer limit) {
        Map<String, Object> map = new HashMap<>(16);
        Map<String, Object> paramMap = new HashMap<>(3);
        paramMap.put("page", page - 1);
        paramMap.put("limit", limit);
        map.put("msg", "");
        map.put("code", 0);
        map.put("data", likenessProductService.listByPage(paramMap));
        map.put("count", likenessProductService.listAll().size());
        return map;
    }
}
