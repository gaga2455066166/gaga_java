<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/6
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl3_foreach</title>
</head>
<body>
foreach循环<br>
<c:forEach begin="1" end="9" var="o" step="3" varStatus="y">
    ${o}---${y.index}-------${y.count}<br>
</c:forEach>

<hr>

<%
    List<String> list = new ArrayList<String>();
    list.add("123");
    list.add("456");
    list.add("789");
    list.add("000");
    request.setAttribute("list_String",list);

%>
 <c:forEach items="${list_String}" var="str" varStatus="s">
     ${s.index}---${s.count}------${str} <br>
 </c:forEach>


<%--有一个容易错的点，就是，${},容易忘了写--%>
</body>
</html>
