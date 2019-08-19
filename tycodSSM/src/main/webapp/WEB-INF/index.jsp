<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/19
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 >登录页面</h2>
<form method="post" action="<%=basePath%>/user/login">
    账号：<input type="text" name="username"><br>
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
