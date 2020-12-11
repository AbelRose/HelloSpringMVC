package com.matrix.springmvc.day05.SS.matrix.controller;

import com.matrix.springmvc.day05.SS.matrix.bean.Teacher;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @RequestMapping("/testListener")
    public void testListener(HttpSession session) {
        ServletContext servletContext = session.getServletContext();
        ApplicationContext ac = (ApplicationContext)servletContext.getAttribute("ac");
        Teacher teacher = ac.getBean("teacher", Teacher.class);
        System.out.println(teacher);
    }
}
