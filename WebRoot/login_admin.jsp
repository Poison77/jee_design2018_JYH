<%@ page language="java" pageEncoding="utf-8"	contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>登录</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">    
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="login/css/styles.css">
	</head>

<body>
	<div class="htmleaf-container">
		<div class="wrapper">
			<div class="container">
				<h1>Welcome</h1>
				<s:debug/> 
				<s:actionerror/>
				<form class="form" action="LoginAction" method="post">				
					<input type="text" name="admin.username" placeholder="Username"> 
					<input type="password" name="admin.password" placeholder="Password">
					<!-- 测试校验字段<input type="text" name="test_string" placeholder="Testing"> -->
					<input type="submit" value="登陆" id="login-button">
				</form> 	
			</div>
			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
	</div>

	<script src="login/js/jquery-2.1.1.min.js" type="text/javascript"></script>
<%-- 	<script>
	//  Welcome下滑动画
		$('#login-button').click(function(event) {
			event.preventDefault();
			$('form').fadeOut(500);
			$('.wrapper').addClass('form-success');
		});
	
	</script>
 --%>
	<div
		style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#000000">
		<h1>影评系统</h1>
	</div>
</body>
</html>
