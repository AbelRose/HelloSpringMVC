package com.matrix.springmvc.day03.crud.controller;


import com.matrix.springmvc.day03.crud.bean.Employee;
import com.matrix.springmvc.day03.crud.dao.DepartmentDao;
import com.matrix.springmvc.day03.crud.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emps")
    public String getAll(Map<String, Object> map) {
        Collection<Employee> emps = employeeDao.getAll(); // 应该将结果放在request中 三种方法(Map方法用的较多)
        map.put("emps", emps);
        return "list";
    }


}
