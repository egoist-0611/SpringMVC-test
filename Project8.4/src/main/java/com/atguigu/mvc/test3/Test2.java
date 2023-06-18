package com.atguigu.mvc.test3;

import org.springframework.ui.Model;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Test2 {
    @ExceptionHandler(Exception.class)
    public String testException(Exception ex, Model model) {
        model.addAttribute("ex", ex);
        return "error";
    }
}
