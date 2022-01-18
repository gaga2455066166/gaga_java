package com.cjl.springboot.demo.controller;


import com.cjl.springboot.demo.model.Student;
import com.cjl.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/detail")
    public @ResponseBody Object studentDetail(Integer id){

        return studentService.queryStudentById(id);
    }
}
