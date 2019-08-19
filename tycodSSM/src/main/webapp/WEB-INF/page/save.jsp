<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/19
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<link rel="stylesheet" href="<%=basePath%>/lib/bootstrap.min.css">
<head>
    <title>Title</title>
</head>
<body>
    ssm整合
    <ul>
        <li><a href="<%=basePath%>/customer/toSavePage"><strong>添加信息功能</strong></a></li>
        <li><a href="<%=basePath%>/customer/toListPage"><strong>分页查询功能</strong></a></li>
    </ul>

    <div>
        <h1>客户信息添加功能</h1>
        <form action="<%=basePath%>/customer/save">
            姓名：<input type="text" name="name"><br>
            电话：<input type="text" name="telephone"><br>
            住址：<input type="text" name="address"><br>
            备注：<input type="text" name="remark"><br>
            <input type="submit" name="提交">
            <input type="reset" name="重置" class="btn btn-info text-center">
        </form>
    </div>
</body>
</html>
