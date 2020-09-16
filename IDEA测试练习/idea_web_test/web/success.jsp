<%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/3
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>
    <%=
    request.getSession().getAttribute("username")
    %>
    ,欢迎您。
</h1>
</body>
</html>
