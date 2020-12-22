package com.cjl.controller;

import com.cjl.vo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    public ModelAndView doSubmit(String name, int age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);

        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/submitByObject.do")
    public ModelAndView doSubmitByObject(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("StudentName", student.getName());
        mv.addObject("StudentAge", student.getAge());

        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = "/returnString.do")
    public String returnString(HttpServletRequest request, Student student) {
        System.out.println("Method: returnString was finish");
        request.setAttribute("stringName", student.getName());
        request.setAttribute("stringAge", student.getAge());
        return "show";
    }

    @RequestMapping(value = "/returnVoidAjax.do")
    public void returnVoidAjax(HttpServletResponse response, Student student) {
        System.out.println("Method: returnVoidAjax was finish");
        Student student1 = new Student();
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        ObjectMapper objectMapper = new ObjectMapper();
        response.setContentType("application/json;charset=utf-8");
        String jsonStr = "";
        try {
            jsonStr = objectMapper.writeValueAsString(student1);
            response.getWriter().print(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("json:" + jsonStr);
    }

    @RequestMapping(value = "/returnObject.do")
    @ResponseBody
    public Student returnObject(String name, int age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return student;
    }

    @RequestMapping(value = "/returnObjects.do")
    @ResponseBody
    public List<Student> returnObjects(String name, int age) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student();
        student1.setAge(age);
        student1.setName(name);

        Student student2 = new Student();
        student2.setAge(12);
        student2.setName("name");

        students.add(student1);
        students.add(student2);
        return students;
    }
}
