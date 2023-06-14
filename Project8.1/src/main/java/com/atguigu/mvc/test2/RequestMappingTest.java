package com.atguigu.mvc.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test2")
public class RequestMappingTest {
    @RequestMapping(value="/index",method = {RequestMethod.POST})
    public String toTarget1(){
        return "target";
    }
//    @RequestMapping(value="/index")
//    public String toTarget2(){
//        return "target";
//    }
}
