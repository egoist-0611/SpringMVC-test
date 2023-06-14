package com.atguigu.mvc.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToIndex {
    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }
}
