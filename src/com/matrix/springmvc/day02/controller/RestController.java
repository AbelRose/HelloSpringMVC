package com.matrix.springmvc.day02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RestController {

    @RequestMapping(value = "/testREST/{id}", method = RequestMethod.GET) // 通过占位符{id}得到id的值
    public String getUserById(@PathVariable("id") Integer id) { //通过 @PathVariable Integer id 作用在方法中
        System.out.println("GET, ID: " + id);
        return "success";
    }

    @RequestMapping(value = "/testREST", method = RequestMethod.POST)
    public String insertUser() {
        System.out.println("POST");
        return "success";
    }

    @RequestMapping(value = "/testREST", method = RequestMethod.PUT)
    public String updatetUser() {
        System.out.println("PUT");
        return "success";
    }

    @RequestMapping(value = "/testREST/{id}", method = RequestMethod.DELETE)
    public String deletetUser(@PathVariable("id") Integer id) {
        System.out.println("DELETE, id = " + id);
        return "success";
    }

    @RequestMapping(value = "testAjax_DELETE", method = RequestMethod.DELETE)
    public void testAjax_DELETE(Integer id) {
        System.out.println("testAjax_DELETE, id = " + id);
    }
}
