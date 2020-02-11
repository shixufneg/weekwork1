package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class IndexController {

    @RequestMapping("/user/show.do")
    public void show(){
        System.out.println("请求");
    }
}
