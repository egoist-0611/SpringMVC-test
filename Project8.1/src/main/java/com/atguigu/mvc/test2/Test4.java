package com.atguigu.mvc.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test4 {
    @RequestMapping("/test/{id}/{name}")
//    public String index(@PathVariable("id")int id,@PathVariable("userName")String name){
    public String index(@PathVariable("id")int id,@PathVariable("name")String name){
        System.out.println(id+"_"+name);
        return "target";
    }
}
