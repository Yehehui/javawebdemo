<%--
  Created by IntelliJ IDEA.
  User: 叶贺辉
  Date: 2019/4/29
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="./updateUser" method="post">
    用户编号：<input type="text" name="id" value="${user.id}" readonly="true"><br/>
    登陆名称：<input type="text" name="loginname" value="${user.loginname}"><br/>
    登陆密码：<input type="text" name="password" value=" ${user.password}"><br/>
    昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：<input type="text" name="name" value="${user.name}"><br/>
    性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：<select name="sex" lay-verify="">
        <option value="男">男</option>
        <option value="女">女</option>
    </select><br/>
    联系电话：<input type="text" name="tel" value="${user.tel}"><br/>
    电子邮箱：<input type="text" name="email" value="${user.email}"><br/>
    <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
    <input type="reset" value="重置">
</form>
</body>
</html>
