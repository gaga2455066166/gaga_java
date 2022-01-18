package com.cjl.servlet;

import com.cjl.domain.Student;
import com.cjl.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/TestServlet8")
public class TestServlet8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("login");
        User user = new User();
        Map<String, String[]> map = request.getParameterMap();
//        map.forEach((key, value) -> System.out.println(key + ":" + Arrays.toString(value)));
        try {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        if ("id123".equals(user.getId()) && "pwd123456".equals(user.getPwd())){
            System.out.println("login success");
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString("登陆成功");

            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(json);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
