<!DOCTYPE html>
<head>
	<title>Contact Form One</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<link href="bootstrap/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
	<link href="bootstrap/css/templatemo_style.css" rel="stylesheet" type="text/css">
</head>
<body class="templatemo-bg-image-2">
	<div class="container">
		<div class="col-md-12">			
			<form class="form-horizontal templatemo-contact-form-1" role="form" action="#" method="post">
				<div class="form-group">
					<div class="col-md-12">
						<h1 class="margin-bottom-15">注 册</h1>
						<p>欢迎注册代办事件系统 <a href="login.jsp">点击这里</a> 跳转到登录界面
						<p>注意打 * 号为必填选项</p>
					</div>
				</div>				
		        <div class="form-group">
		          <div class="col-md-12">		          	
		            <label for="username" class="control-label">用户名 *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-user"></i>
		            	<input type="text" class="form-control" id="username" placeholder="">
		            </div>		            		            		            
		          </div>              
		        </div>
				<div class="form-group">
					<div class="col-md-12">
						<label for="realname" class="control-label">真实姓名 *</label>
						<div class="templatemo-input-icon-container">
							<i class="fa fa-user"></i>
							<input type="text" class="form-control" id="realname" placeholder="">
						</div>
					</div>
				</div>
		        <div class="form-group">
		          <div class="col-md-12">
		            <label for="email" class="control-label">邮箱 *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-envelope-o"></i>
		            	<input type="email" class="form-control" id="email" placeholder="">
		            </div>
		          </div>
		        </div>
		        <div class="form-group">
		          <div class="col-md-12">
		            <label for="password" class="control-label">密 码</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-lock"></i>
		            	<input type="password" class="form-control" id="password" placeholder="">
		            </div>
		          </div>
		        </div>
				<div class="form-group">
					<div class="col-md-12">
						<label for="password" class="control-label">再次确认密码</label>
						<div class="templatemo-input-icon-container">
							<i class="fa fa-lock"></i>
							<input type="password" class="form-control" id="repassword" placeholder="">
						</div>
					</div>
				</div>
		        <div class="form-group">
		          <div class="col-md-12">
		            <label for="subject" class="control-label">Subject *</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-info-circle"></i>
		            	<input type="text" class="form-control" id="subject" placeholder="">
		            </div>
		          </div>
		        </div>
		        <div class="form-group">
		          <div class="col-md-12">
		            <label for="message" class="control-label">简介</label>
		            <div class="templatemo-input-icon-container">
		            	<i class="fa fa-pencil-square-o"></i>
		            	<textarea rows="8" cols="50" class="form-control" id="message" placeholder=""></textarea>
		            </div>
		          </div>
		        </div>
		        <%--<div class="form-group">--%>
		          <%--<div class="col-md-12">--%>
		            <%--<div class="checkbox">--%>
		                <%--<label>--%>
		                  <%--<input type="checkbox"> Send a copy to my email.--%>
		                <%--</label>--%>
		            <%--</div>		            --%>
		          <%--</div>--%>
		        <%--</div>--%>
		        <div class="form-group">
		          <div class="col-md-12">
		            <input type="submit" value="注  册" class="btn btn-success pull-right">
		          </div>
		        </div>		    	
		      </form>		      
		</div>
	</div>
</body>
</html>