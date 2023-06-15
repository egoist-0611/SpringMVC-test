package com.atguigu.mvc.test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2 {
    @RequestMapping("/pojoTest")
    public String testPojo(User user, int password) {
        System.out.println(user + "---- password:" + password);
        return "success";
    }

    @RequestMapping("encodingTest")
    public String encodingTest(String username, int age) {
        System.out.println(username + "-" + age);
        return "success";
    }
}
