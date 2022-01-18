package com.cjl.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(Model model){

        model.addAttribute("data","SpringBoot框架集成JSP页面");

        return "index";
    }
}
