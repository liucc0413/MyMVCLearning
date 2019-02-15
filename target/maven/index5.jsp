<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<body>
浏览器的cookie禁用时，jsp实现URL重写表单<br>
<hr/>
<!-- 下面是登录按钮encodeURL方法重写url -->
<form action="<%=response.encodeURL("/lcc/test6/Login")%>" method="post">
    <input type="text" name="name"/><br/>
    <input type="submit" value="登录"/>
</form>
<!-- 下面是GOto按钮encodeURL方法重写url -->
<a href="<%=response.encodeURL("/lcc/test6/Login")%>">GoTo</a>
</body>
</html>