<%@ page import="com.cjl.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 24550
  Date: 2020/8/5
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
</head>
<body>
<%
    User user = new User();
    user.setUsername("陈进龙");
    user.setPassword("123456");
    user.setId(123);
    user.setBirthday(new Date());

    request.setAttribute("user0", user);

    List lists = new ArrayList();
    lists.add("haha");
    lists.add("hehe");
    request.setAttribute("lists",lists);


%>

<h3>获取user中的值</h3>
${requestScope.user}<br>
${requestScope.user.id}<br>
${requestScope.user.password}<br>
${requestScope.user.username}
${requestScope.user.birStr}
<br>

${requestScope.lists[0]}

还有map

</body>
</html>
