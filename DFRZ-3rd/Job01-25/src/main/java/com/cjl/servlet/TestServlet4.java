package com.cjl.servlet;

import com.cjl.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/TestServlet4")
public class TestServlet4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //先在TestServlet4中存一个session，然后在TestServlet5取出来。
        Student student = new Student();
        student.setName("erD");
        student.setId(5);
        HttpSession session = request.getSession();
        session.setAttribute("student",student);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
