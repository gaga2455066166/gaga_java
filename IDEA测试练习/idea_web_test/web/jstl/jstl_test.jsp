<%@ page import="com.cjl.domain.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/7
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<%
    List<User> list = new ArrayList<>();
    list.add(new User(1, "1", "123", new Date()));
    list.add(new User(2, "2", "123", new Date()));
    list.add(new User(3, "3", "123", new Date()));
    list.add(new User(4, "4", "123", new Date()));
    list.add(new User(5, "5", "123", new Date()));
    request.setAttribute("list", list);
%>
<table border="2" width="500" align="center">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>密码</th>
        <th>生日</th>
    </tr>
    <C:forEach items="${list}" var="user" varStatus="s">
        <c:if test="${s.count % 2 == 0}">
            <tr bgcolor="#ffc0cb">
                <td>${s.count}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>

        <c:if test="${s.count % 2 != 0}">
            <tr bgcolor="#8a2be2">
                <td>${s.count}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.birStr}</td>
            </tr>
        </c:if>

    </C:forEach>
</table>
</body>
</html>
