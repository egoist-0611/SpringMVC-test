package com.atguigu.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1 {
//    @RequestMapping("/thymeleafView")
    public String testThymeleafView() {
        return "success";
    }

    @RequestMapping("/internalResourceView")
    public String testInternalResourceView() {
        return "forward:/thymeleafView";
    }

//    @RequestMapping("/redirectView")
    public String testRedirectView(){
        return "redirect:/thymeleafView";
    }
}
