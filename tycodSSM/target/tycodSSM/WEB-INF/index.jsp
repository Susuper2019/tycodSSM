<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <%--  <link href="<%=basePath%>/bootstrap.min.css" rel="stylesheet" type="text/css"/>--%>
    <%--<link rel="stylesheet" href="<%=basePath%>/lib/bootstrap.min.js"/>--%>
    <link rel="stylesheet" href="<%=basePath%>/lib/bootstrap.min.js"/>
    <title>首页</title>
<html>
<body>
<h2 class="text-center">分页查询</h2>
<hr/>
<form action="<%=basePath%>/user/login" method="post" class="form-inline text-center">
    <label>username:</label>
    <input type="text" class="form-control" name="username"/>
    <br/>
    <br/>
    <label>password:</label>
    <input type="password" class="form-control" name="password"/>
    <br/>
    <br/>
    <input type="submit" value="登录" class="btn btn-default"/>
</form>
</body>
</html>
