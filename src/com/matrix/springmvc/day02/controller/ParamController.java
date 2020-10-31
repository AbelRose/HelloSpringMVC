package com.matrix.springmvc.day02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
    /*
     * springMVC获取客户端传递的数据的方式：
     * 1、在处理请求的方法中，加入相对应的形参，保证形参参数名和传递的数据的参数名保持一致，就可以自动赋值
     * value：当不满足赋值条件时，可以使用value属性，指定映射关系
     * required：设置形参是否必须被赋值，默认为true，必须赋值，若设置为false，则不必须赋值，因此形参的值为null
     * defaultValue：若形参所获得的值为null，则设置一个默认值，用在分页和模糊查询中
     */
    @RequestMapping(value = "/param", method = RequestMethod.POST)

    public String param(@RequestParam(value = "name", required = false, defaultValue = "defaultValue") String username, String password, String age) { // 保证形参的名字和传过来的一样就可以
        // @RequestParam(value = "name") String username 将JSP中的 username:<input type="text" name="name"><br> 赋值给 username 形参
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("age = " + age);
        return "success";
    }

}
