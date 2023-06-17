package com.atguigu.restful.controller;

import com.atguigu.restful.dao.EmployeeDao;
import com.atguigu.restful.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployees(Model model) {
        List<Employee> employees = employeeDao.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employee";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String getEmployeeById(Model model, @PathVariable("id") Integer id) {
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
    public String updateEmployeeById(Model model, @PathVariable("id") Integer id, Employee employee) {
        employeeDao.updateEmployeeById(id, employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id") Integer id) {
        employeeDao.deleteEmployeeById(id);
        return "redirect:/employee";
    }
}
