<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowMsg</title>
</head>
<body>
<h3>展示页面：</h3>
<h3>msg:${msg}</h3>
<h3>fun:${fun}</h3>
<hr>
<h3>展示提交的数据：</h3>
<h3>name:${name}</h3>
<h3>age:${age}</h3>
<hr>
<h3>展示提交的数据(通过对象接收：</h3>
<h3>StudentName:${StudentName}</h3>
<h3>StudentAge:${StudentAge}</h3>
<hr>

<h1>处理器方法返回String表示视图名称,并展示数据</h1>
<h3>StudentName:${stringName}</h3>
<h3>StudentAge:${stringAge}</h3>
<hr>
</body>
</html>
