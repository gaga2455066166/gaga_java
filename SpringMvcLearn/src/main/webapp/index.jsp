<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function () {
                alert("这是一个ajax请求。");
                $.ajax({
                    url: "returnVoidAjax.do",
                    data: {
                        name: "ZhangSan",
                        age: 34
                    },
                    type: "post",
                    dataType: "json",
                    success: function (data) {
                        alert(data.name);
                    }
                });
            });

            $("#btn2").click(function () {
                alert("这是一个ajax请求。");
                $.ajax({
                    url: "returnObject.do",
                    data: {
                        name: "ZhangSan",
                        age: 34
                    },
                    type: "post",
                    dataType: "json",
                    success: function (data) {
                        alert(data.name);
                    }
                });
            });

            $("#btn3").click(function () {
                alert("这是一个ajax请求。");
                $.ajax({
                    url: "returnObjects.do",
                    data: {
                        name: "ZhangSan",
                        age: 34
                    },
                    type: "post",
                    dataType: "json",
                    success: function (data) {
                        alert(data[0].name);
                        alert(data[1].name);
                    }
                });
            });
        });
    </script>
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

<hr>
<h1>处理器方法返回String表示视图名称</h1>
<form action="${pageContext.request.contextPath}/returnString.do" method="post">
    <label>
        姓名：<input type="text" name="name">
        年龄：<input type="text" name="age">
        <input type="submit" value="Submit">
    </label> <br>
</form>
<hr>
<h1>用一个按钮发起ajax请求：</h1>
<button id="btn1">发起请求</button>

<hr>
<h1>用一个按钮发起ajax请求,服务器用Object返回：</h1>
<button id="btn2">发起请求</button>

<hr>
<h1>用一个按钮发起ajax请求,服务器用Objects返回：</h1>
<button id="btn3">发起请求</button>
</body>
</html>
