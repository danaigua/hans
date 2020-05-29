package com.hengyue.hans.controller;

import com.hengyue.hans.entity.FinancialRegistration;
import com.hengyue.hans.service.FinancialRegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 财务登记控制层接口
 * @author 章家宝
 */
@RestController
@RequestMapping("/financial/registration")
public class FinancialRegistrationController {

    @Resource
    private FinancialRegistrationService financialRegistrationService;

    /**
     * 分页查询所有商品
     * @param page
     * @param limit
     * @return
     */
    @PostMapping("/list")
    public Map<String, Object> list(
            @RequestParam(value = "page", required = true) Integer page,
            @RequestParam(value = "limit", required = true) Integer limit){
        Map<String, Object> map = new HashMap<>(16);
        Map<String, Object> paramMap = new HashMap<>(3);
        paramMap.put("limit", limit);
        paramMap.put("page", page - 1);
        List<FinancialRegistration> financialRegistrations = financialRegistrationService.listByPage(paramMap);
        map.put("data", financialRegistrations);
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", financialRegistrationService.listAll().size());
        return map;
    }
}
