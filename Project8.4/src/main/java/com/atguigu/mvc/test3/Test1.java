package com.atguigu.mvc.test3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1 {
    @RequestMapping("/**/testInterceptor")
    public String testInterceptor() {
        return "success";
    }
    @RequestMapping("/testExceptionHandle")
    public String testExceptionHandle() {
        int i = 1 / 0;
        return "success";
    }
}
