<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    pageContext.setAttribute("basePath",basePath);
%>
<html>
<head>
    <title>result</title>
</head>
<body>
注册结果：${info}
</body>
</html>
