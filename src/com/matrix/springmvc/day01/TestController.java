package com.matrix.springmvc.day01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    /**
     * 假设：localhost:8080/SpringMVC01/hello
     */

//    @RequestMapping("hello") // 请求路径
//    public String hello() { // 这个路径和方法名字没有关系 和 @RequestMapping(value = "") 中的value有关系 但是一般用路径名字作为方法名字
//        System.out.println("success");
//        return "success"; // 视图名称
//    }

    @RequestMapping("hello")
    public String hello(String username, String password) {
        System.out.println(username + "=====" + password);
        return "success";//视图名称
    }

    @RequestMapping("test")
    public String test() {
        System.out.println("TEST");
        return "success";//视图名称
    }

}
