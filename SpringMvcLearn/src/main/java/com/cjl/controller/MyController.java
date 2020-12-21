package com.cjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "欢迎使用springMVC框架");
        mv.addObject("fun", "执行的是dosome方法");

        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/submit.do")
    public ModelAndView doSubmit(String name,int age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);

        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/submitByObject.do")
    public ModelAndView doSubmitByObject(String name,int age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);

        mv.setViewName("show");
        return mv;
    }
}
