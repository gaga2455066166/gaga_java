package com.cjl.controller;

import com.cjl.service.StudentService;
import com.cjl.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService service;

    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String info = "add fail";
        int i = service.addStudent(student);
        if(i>0){
            info = student.getName() + " add success";
        }
        mv.addObject("info",info);
        mv.setViewName("result");
        return mv;
    }

}
