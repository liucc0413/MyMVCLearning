<%--
  Created by IntelliJ IDEA.
  User: liucc
  Date: 18-8-29
  Time: 下午4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" isErrorPage="false" %>
<%!%>
<%%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01Transitional//EN">

欢迎您, ${cookie.account.value }. &nbsp;&nbsp;
    <a href="/lcc/test6/m12?action=logout">
    注销</a>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/lcc/test6/m12" method="post">
    <table>
        <tr><td>账号： </td>
            <td><input type="text"name="account" style="width:
                   200px; "></td>
        </tr>
        <tr><td>密码： </td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>有效期： </td>
            <td><input type="radio" name="timeout" value="-1"
                checked> 关闭浏览器即失效 <br/> <input type="radio"
                                               name="timeout" value="<%= 30 *24 * 60 * 60 %>"> 30天
                内有效 <br/><input type="radio" name="timeout" value=
                        "<%= Integer.MAX_VALUE %>"> 永久有效 <br/> </td> </tr>
        <tr><td></td>
            <td><input type="submit"value=" 登  录 " class=
                    "button"></td>
        </tr>
    </table>
</form>
</body>
</html>
