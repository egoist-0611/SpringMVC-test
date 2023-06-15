package com.atguigu.mvc.test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Test1 {
    @RequestMapping("/servletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + "_" + password);
        return "success";
    }

    @RequestMapping("/paramTest")
    public String testParam(int password, String username) {
        System.out.println(username + "_" + password);
        return "success";
    }

    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(value = "username", required = false, defaultValue = "hehe") String userName, int password) {
        System.out.println(userName + "_" + password);
        return "success";
    }

    @RequestMapping("/requestHeader")
    public String requestHeader(@RequestHeader("HOST") String host) {
        System.out.println(host);
        return "success";
    }

    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue("Idea-98471caa") String cookie){
        System.out.println(cookie);
        return "success";
    }

}