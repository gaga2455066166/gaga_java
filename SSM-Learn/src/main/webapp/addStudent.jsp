<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    pageContext.setAttribute("basePath",basePath);
%>
<html>
<head>
    <title>addStudent</title>
    <base href="<%=basePath%>">
</head>
<body>
<div>
    <form action="student/addStudent.do" method="post">
        <table>
            <tr>
                <td>id：</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>提交：</td>
                <td><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
