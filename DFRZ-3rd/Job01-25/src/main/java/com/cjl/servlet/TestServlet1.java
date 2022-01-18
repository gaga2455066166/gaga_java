package com.cjl.servlet;

import com.cjl.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestServlet1")
public class TestServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("-----------This is TestServlet1-----------");
        Student student = new Student();
        student.setId(1);
        student.setName("wu");
        request.setAttribute("student",student);

        //先用请求转发，request生效
//        request.getRequestDispatcher("/TestServlet2").forward(request,response);

        //再用请求重定向，等同于有两次请求，request域不能生效
//        response.sendRedirect("/Job01_25_war_exploded/TestServlet3");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
