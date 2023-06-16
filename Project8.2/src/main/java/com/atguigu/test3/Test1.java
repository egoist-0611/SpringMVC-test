package com.atguigu.test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Test1 {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUsers() {
        System.out.println("get all users");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") int id) {
        System.out.println("get user by id=" + id);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(String username, int age) {
        System.out.println("add user username=" + username + " age=" + age);
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String updateUser(String username, int age, @PathVariable("id") int id) {
        System.out.println("update user username=" + username + " age=" + age + " where id=" + id);
        return "success";
    }
}
