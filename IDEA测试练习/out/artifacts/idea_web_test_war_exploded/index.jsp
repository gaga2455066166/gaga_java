<%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/7/17
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%
    System.out.println("你好，jsp");
    int i = 5;
    String contextPath = request.getContextPath();
    out.print(contextPath);
%>
<%!
    int i = 3;
%>
<%=
"HELLO"+i
%>
<%
    response.getWriter().write("response肯定先于out输出\n");
%>


你好，jsp
</body>
</html>
