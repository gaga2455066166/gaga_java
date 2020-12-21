<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<h3>这是一个页面</h3>
<a href="${pageContext.request.contextPath}/some.do">发起一个some.do的请求</a>

<h3>提交信息给服务器：</h3>
<form action="${pageContext.request.contextPath}/submit.do" method="post">
    <label>
        姓名：<input type="text" name="name">
        年龄：<input type="text" name="age">
        <input type="submit" value="Submit">
    </label> <br>
</form>

<h3>提交信息给服务器，服务器用对象接收：</h3>
<form action="${pageContext.request.contextPath}/submitByObject.do" method="post">
    <label>
        姓名：<input type="text" name="name">
        年龄：<input type="text" name="age">
        <input type="submit" value="Submit">
    </label> <br>
</form>
</body>
</html>
