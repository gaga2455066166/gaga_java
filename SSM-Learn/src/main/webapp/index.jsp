<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
            request.getServerPort() + path + "/";
    pageContext.setAttribute("basePath",basePath);
%>
<html>
<head>
    <title>SSM整合开发学习</title>
    <base href="<%=basePath%>">
</head>
<body>

<div>
    <h1>SSM整合开发学习</h1>
    <table>
        <tr>
            <td><a href="addStudent.jsp"> 学生注册</a></td>
        </tr>
        <tr>
            <td>学生查询</td>
        </tr>
    </table>


</div>
</body>
</html>
