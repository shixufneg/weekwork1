package com.itdr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/user/show.do")
    public ModelAndView show(){
        System.out.println("请求竟来了！");
        ModelAndView m = new ModelAndView();
        m.setViewName("home");
        m.addObject("name","sxf");
        return m;
    }
    @RequestMapping("/user/hh.do")
    public String hh(){
        return "list";
    }
}
