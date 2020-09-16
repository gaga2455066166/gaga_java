<%@ page import="java.net.URLDecoder" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/1
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示时间</title>
</head>
<body>
<%
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
%>
</body>
</html>
