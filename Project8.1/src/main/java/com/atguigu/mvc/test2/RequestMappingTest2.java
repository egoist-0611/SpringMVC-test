package com.atguigu.mvc.test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingTest2 {
    @RequestMapping(
            value = "/paramTest",
            params = {"username=111", "password!='aaa'"},
            headers = {"Connection=keep-alive"}
    )
    public String paramTest() {
        return "target";
    }
}
