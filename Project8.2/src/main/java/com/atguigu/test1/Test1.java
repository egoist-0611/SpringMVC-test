package com.atguigu.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Test1 {
    @RequestMapping("/servletAPI")
    public String testServletAPI(HttpServletRequest request) {
        request.setAttribute("name", "Tom");
        return "success";
    }
}
