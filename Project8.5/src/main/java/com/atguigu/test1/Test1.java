package com.atguigu.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1 {
//    @RequestMapping("/")
//    public String toIndex() {
//        return "index";
//    }

    @RequestMapping("/testAll")
    public String testAll() {
        return "success";
    }
}
