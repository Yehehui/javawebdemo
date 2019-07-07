<%--
  Created by IntelliJ IDEA.
  User: 叶贺辉
  Date: 2019/4/29
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="width:100%" border="1">
    <tr>
        <td>客户编号</td>
        <td>登陆名称</td>
        <td>登陆密码</td>
        <td>客户昵称</td>
        <td>性别</td>
        <td>联系电话</td>
        <td>电子邮件</td>
        <td>操作</td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.loginname}</td>
            <td>${user.password}</td>
            <td>${user.name}</td>
            <td>${user.sex}</td>
            <td>${user.tel}</td>
            <td>${user.email}</td>
            <td><a href="./update?id=${user.id}"><button>修改</button></a><a href="./deleteUser?id=${user.id}"><button>删除</button></a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
