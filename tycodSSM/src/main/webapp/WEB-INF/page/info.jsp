<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/19
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<link href="<%=basePath%>/lib/bootstrap.min.css" rel="stylesheet">
<head>
    <title>Title</title>
</head>
<body>
    ssm整合
<ul>
    <li><a href="<%=basePath%>/customer/toSavePage"><strong>添加保存用户</strong></a> </li>
    <li><a href="<%=basePath%>/customer/toListPage"><strong>分页查询</strong></a> </li>
</ul>
<h1 class="text-center">${message}</h1>
</body>
</html>
