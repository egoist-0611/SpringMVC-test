package com.atguigu.restful.dao;

import com.atguigu.restful.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao extends BaseDao<Employee> {
    /**
     * 查询所有的员工信息
     *
     * @return employee对象集合
     */
    public List<Employee> getAllEmployees() {
        String sql = "SELECT id,name,gender,age,phone FROM employee";
        return cListOption(Employee.class, sql);
    }

    /**
     * 根据id查询员工信息
     *
     * @param id 员工id
     * @return employee对象
     */
    public Employee getEmployeeById(Integer id) {
        String sql = "SELECT id,name,gender,age,phone FROM employee WHERE id=?";
        return cObjOption(Employee.class, sql, id);
    }

    /**
     * 通过id修改员工信息
     *
     * @param id       员工id
     * @param employee employee对象
     */
    public void updateEmployeeById(Integer id, Employee employee) {
        String sql = "UPDATE employee SET name=?,gender=?,age=?,phone=? WHERE id=?";
        int rows = urdOption(sql, employee.getName(), employee.getGender(), employee.getAge(), employee.getPhone(), employee.getId());
        if (rows == 0) {
            throw new RuntimeException("修改员工信息失败");
        }
    }

    /**
     * 添加员工信息
     *
     * @param employee employee对象
     */
    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee(name,gender,age,phone) VALUES(?,?,?,?)";
        int rows = urdOption(sql, employee.getName(), employee.getGender(), employee.getAge(), employee.getPhone());
        if (rows == 0) {
            throw new RuntimeException("添加员工信息失败");
        }
    }

    /**
     * 删除员工信息
     *
     * @param id 员工id
     */
    public void deleteEmployeeById(Integer id) {
        String sql = "DELETE FROM employee WHERE id=?";
        int rows = urdOption(sql, id);
        if (rows == 0) {
            throw new RuntimeException("删除员工信息失败");
        }
    }
}
