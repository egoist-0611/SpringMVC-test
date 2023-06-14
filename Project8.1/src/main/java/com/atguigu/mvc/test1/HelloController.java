package com.atguigu.mvc.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    //    @RequestMapping(value = "target.html")
//    public String toTarget(){
//        return "target";
//    }
    @RequestMapping(value = "/target.html")
    public String toTarget() {
        return "target";
    }

//    @RequestMapping(value = "/")
//    public String toIndex() {
//        return "target";
//    }
}
