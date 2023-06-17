package com.atguigu.mvc.test1;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1 {
    @RequestMapping("/requestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println(requestBody);
        return "success";
    }

    @RequestMapping("/requestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/responseBody")
    @ResponseBody
    public String testResponseBody() {
        return "abcdefg";
    }

    @RequestMapping("/responseObj")
    @ResponseBody
    public User getJson() {
        return new User(1001, "Tom", 11);
    }

    @RequestMapping("/responseAxios")
    @ResponseBody
    public User getAxios(User user) {
        System.out.println(user);
        return new User(1002, "Amy", 20);
    }
}
