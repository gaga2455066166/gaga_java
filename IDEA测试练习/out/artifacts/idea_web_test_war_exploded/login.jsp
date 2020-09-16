<%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/3
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        window.onload = function () {
            document.getElementById("checkCodeImg").onclick = function () {
                this.src = "CheckCodeServletDemo1?time=" + new Date().getTime();
            }
        }
    </script>
    <style>
        div {
            color: red;
        }
    </style>
</head>
<body>
<form action="LoginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td>
                <label>
                    <input type="text" name="username">
                </label>
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <label>
                    <input type="password" name="password">
                </label>
            </td>
        </tr>
        <tr>
            <td>验证码</td>
            <td>
                <label>
                    <input type="text" name="checkCode">
                </label>
            </td>
        </tr>
        <tr>
            <td colspan="2"><img id="checkCodeImg" src="CheckCodeServletDemo1" alt="验证码图片"></td>
        </tr>
        <tr>
            <td colspan="2">
                <label>
                    <input type="submit" value="登录">
                </label>
            </td>
        </tr>
    </table>
</form>

<div>
    <%=
    request.getAttribute("checkCode_error") == null ? "" : request.getAttribute("checkCode_error")
    %>
</div>
<div>
    <%=
    request.getAttribute("user_error") == null ? "" : request.getAttribute("user_error")
    %>
</div>
</body>
</html>
