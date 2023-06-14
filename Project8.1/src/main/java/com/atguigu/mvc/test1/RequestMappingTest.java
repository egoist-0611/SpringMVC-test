package com.atguigu.mvc.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingTest {
    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }
}
