package com.matrix.springmvc.day03.crud.controller;


import com.matrix.springmvc.day03.crud.bean.Department;
import com.matrix.springmvc.day03.crud.bean.Employee;
import com.matrix.springmvc.day03.crud.dao.DepartmentDao;
import com.matrix.springmvc.day03.crud.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmpController {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;


    /**
     * 获取所有的员工信息
     * @param map
     * @return
     */
    @RequestMapping(value = "/emps")
    public String getAll(Map<String, Object> map) {
        Collection<Employee> emps = employeeDao.getAll(); // 应该将结果放在request中 三种方法(Map方法用的较多)
        map.put("emps", emps);
        return "list";
    }

    /**
     * 跳转到添加也米娜
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String toAdd(Map<String, Object> map) {
        Collection<Department> depts = departmentDao.getDepartments();  // 放在作用域中
        map.put("depts", depts);
        return "add";
    }


    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps"; // 如果不用重定向而用转发 在数据发生增删改的时候会发生数据重复
    }


    /**
     * 获取要回显的数据 跳转大修改页面 并回显
     * @param id
     * @param map
     * @return
     */
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id")Integer id, Map<String, Object> map) {
        // 获取要修改的员工信息
        Employee emp = employeeDao.get(id);  //放在作用域中
        // 获取所有的部门信息供用户选择
        Collection<Department> depts = departmentDao.getDepartments();
        map.put("emp", emp);
        map.put("depts", depts);
        return "update";
    }


    /**
     * 修改
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public String updateEmp(Employee employee) {
        employeeDao.save(employee); // 修改
        return "redirectL /emps";
    }


    /**
     * 删除
     */
    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    public String deleteEmp(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect: /emps";
    }


}
