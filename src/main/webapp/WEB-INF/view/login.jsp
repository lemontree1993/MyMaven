<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
    <link rel="stylesheet" href="../../bootstrap/css/bootstrap.min.css" />
    <link href="../../css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="../../bootstrap/js/jquery-1.11.1.min.js" ></script>
    <script type="text/javascript" src="../../bootstrap/js/bootstrap.min.js" ></script>
</head>
<body>
<div class="conner">
    <div class="header">
        <h1>Login</h1>
    </div>
    <form class="form-inline" role="form">
        <div class="form-group">
            <label class="form-label">用户名:</label>
            <input type="text" class="form-control" />
        </div>
        <br />
        <br />
        <div class="form-group">
            <label class="form-label">密&nbsp;&nbsp;&nbsp;码:</label>
            <input type="password" class="form-control"/>
        </div>
        <br />
        <br />
        <div class="form-group">
            <button class="btn btn-primary" id="loginBtn">登录</button>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#" class="forgetPwd">忘记密码?</a>
        </div>
    </form>
</div>

</body>

</html>