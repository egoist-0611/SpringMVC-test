package com.atguigu.test1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class Test1 {
    @RequestMapping("/servletAPI")
    public String testServletAPI(HttpServletRequest request) {
        request.setAttribute("name", "Tom");
        return "success";
    }

    @RequestMapping("/modelAndView")
    public String testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "July");
        modelAndView.setViewName("success");
        return "success";
//        return modelAndView;
    }

    @RequestMapping("/model")
    public String testModel(Model model) {
        model.addAttribute("name", "Amy1");
        return "success";
    }

    @RequestMapping("/map")
    public String testMap(Map<String, Object> map) {
        map.put("name", "Amy2");
        return "success";
    }

    @RequestMapping("/modelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("name", "Amy3");
        return "success";
    }

    @RequestMapping("/session")
    public String testSession(HttpSession session) {
        session.setAttribute("name", "June");
        return "success";
    }

    @RequestMapping("/application")
    public String testApplication(HttpSession session) {
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("name", "Mike");
        return "success";
    }
}
