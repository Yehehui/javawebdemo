<%--
  Created by IntelliJ IDEA.
  User: 叶贺辉
  Date: 2019/7/7
  Time: 18:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="login_form"  action="./test">
    <label for="login_name">登录名称:</label>
    <input id="login_name" type="text"  name="name" onblur="return judge()">
    <button type="button"  onclick="update();">登录</button>
</form>
<script>
    // function judge() {
    //     alert(1)
    //     var err=document.getElementById("error")
    //     err.remove()
    //     var name=document.getElementById("login_name")
    //     if(name.length<3||name.length>16){
    //         document.getElementById("login_form").innerHTML="<font id='error' color='red'>请输入3-16位的用户名！</font>"
    //         return false
    //     }else{
    //         document.getElementById("login_form").innerHTML="<font id='error' color='red'>输入正确！</font>"
    //         return false
    //     }
    // }
$.ready(function () {
    $("#login_form").validate({
        rules:{
            login_name:{
                require:true
            }
        },
        message:{
            login_name:{
                require:"请输入用户名"
            }
        }
    })
})
    function update() {
    alert(1)
        var valid=$("#login_form").valid()
        if(!valid){
            return false
        }
    }
</script>
<script src="../resource/jquery.js"></script>
</body>
</html>
