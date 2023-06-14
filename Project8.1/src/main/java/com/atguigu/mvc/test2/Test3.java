package com.atguigu.mvc.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test3 {
//    @RequestMapping("/a?a/index")
//    @RequestMapping("/a*a/index")
    @RequestMapping("**/index")
    public String toTarget() {
        return "target";
    }
}
