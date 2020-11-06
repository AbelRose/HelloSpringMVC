package com.matrix.springmvc.day04.test;

import com.matrix.springmvc.day04.bean.Employee;
import com.matrix.springmvc.day04.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class TestController {

    @Autowired
    private EmployeeDao employeeDao;


    /**
     * springMVC处理json的四个条件：
     * 1、导入jackson的jar
     * 2、在springMVC的配置文件中开启MVC驱动，<mvc:annotation-driven />
     * 3、在处理ajax请求的方法上加上注解@ResponseBody
     * 4、将要转换为json且响应到客户端的数据，直接作为该方法的返回值返回
     * @ResponseBody 将方法作为响应体返回到客户端(方法专门用于响应的而不是页面跳转)
     * @return
     */
    @RequestMapping("testJson")
    @ResponseBody()
    public Collection<Employee> testJson() {
        Collection<Employee> emps = employeeDao.getAll();
//        return "success";
        return emps; // 直接返回的是Java对象 直接用前端的JS接受是不行滴！需要有Jackson 之前需要开启<mvc:annotation-driven/>
    }
}
