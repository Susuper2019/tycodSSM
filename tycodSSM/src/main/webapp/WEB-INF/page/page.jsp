<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/19
  Time: 11:35
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
    ssm整合
<div>
    <ul>
        <li><a href="<%=basePath%>/customer/toSavePage">添加信息功能</a></li>
        <li><a href="<%=basePath%>/customer/toListPage">分页查询功能</a></li>
        <li><strong>丑归丑，先能用....</strong></li>
    </ul>
</div>
</body>
</html>
