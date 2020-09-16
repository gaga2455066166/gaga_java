package com.cjl.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieServletTest1")
public class CookieServletTest1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie :
                    cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)) {
                    flag = true;
                    String value = cookie.getValue();
                    String value_decode = URLDecoder.decode(value, "utf-8");
                    response.getWriter().write("欢迎回来，您上 次的访问时间为：" + value_decode);
                    //写入新的时间
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
                    String date_format = sdf.format(date);

                    String date_encode = URLEncoder.encode(date_format, "utf-8");
                    cookie.setValue(date_encode);
                    cookie.setMaxAge(60 * 60 * 24 * 30);
                    response.addCookie(cookie);
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || !flag) {
            response.getWriter().write("欢迎您的首次访问。");
            Date date0 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
            String date_format = sdf.format(date0);
            String date_encode = URLEncoder.encode(date_format, "utf-8");
            Cookie cookie = new Cookie("lastTime", date_encode);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
