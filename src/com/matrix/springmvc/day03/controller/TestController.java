package com.matrix.springmvc.day03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    /**
     * View 作用: 处理模型数据  实现页面跳转(转发/重定向)
     *
     * View 类型
     * InternalResourceView 转发视图
     * JstlView 转发视图(支持JSTL)
     * RedirectView 重定向视图
     * @return
     */
    @RequestMapping("/test")
    public String test() {
//        return "redirect: /index.jsp"; // 重定向
        return "success";
    }
}
