<%--
  Created by IntelliJ IDEA.
  User: lemontree
  Date: 2016/8/21
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>系统登录</title>
    <!-- Custom Theme files -->
    <link rel="stylesheet" href="/css/style.css" type="text/css">
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script src="bootstrap/js/jquery-1.11.1.min.js"></script>
    <!--Google Fonts-->
    <link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <!--Google Fonts-->
</head>
<body>
<div class="login">
    <h2>WELCOME TO !</h2>
    <div class="login-top">
        <h1>LOGIN THE SYSTEM</h1>
        <form>
            <input type="text" value="User Id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Id';}">
            <input type="password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
        </form>
        <div class="forgot">
            <a href="#">forgot Password</a>
            <input type="submit" value="Login" >
        </div>
    </div>
    <div class="login-bottom">
        <h3>New User &nbsp;<a href="#">Register</a>&nbsp Here</h3>
    </div>
</div>
<div class="copyright">
</div>


</body>
<script>
    $(function () {
        window.location.href = "/user/login.htm";
    })
</script>
</html>