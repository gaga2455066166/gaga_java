package com.cjl.servlet;

import com.cjl.domain.Student;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/TestServlet7")
public class TestServlet7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //就算浏览器关闭，也能获取到对象，甚至在别的浏览器也能获取到。
        ServletContext servletContext = request.getServletContext();
        Student student = (Student) servletContext.getAttribute("student");
        System.out.println(student);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
