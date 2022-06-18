<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap" rel="stylesheet">
<link href="./login.css" rel=stylesheet>
</head>
<body>
	<div class="page-container">
		<div class="login-form-container shadow">
			<div class="login-form-right-side">
				<div class="top-logo-wrap">
				</div>
				<h1>JinLog</h1>
				<p>jinyoung's community </p>
			</div>

			<div class="login-form-left-side">
				<form action="signUpProc.jsp" class="login-input-container">
					<h1>SignUp</h1>
					<div class="login-input-wrap input-id">
						<i class="far fa-envelope"></i>
						<input placeholder="Email" name="username" type="text">
					</div>
					<div class="login-input-wrap input-password">
						<i class="fas fa-key"></i>
						<input placeholder="Password" name="password" type="password">
					</div>
					<div class="login-btn-wrap">
						<button class="login-btn">SignUp</button>
					</div>
					<a class="signUp" href="index.jsp">Back</a>
				</form>

			</div>
		</div>
	</div>
</body>
</html>

