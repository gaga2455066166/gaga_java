<%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/5
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取</title>
</head>
<body>
${3>4}
<%
    request.setAttribute("name","陈进龙");
    session.setAttribute("age",19);

%>
${requestScope.name}<br>
${sessionScope.age}

</body>
</html>
