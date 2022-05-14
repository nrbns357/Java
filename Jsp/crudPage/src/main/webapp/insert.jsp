<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap" rel="stylesheet">
<link href="./mystyle.css" rel=stylesheet>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div class="main">
		<h1>insert 페이지</h1>
		<form action="insertproc.jsp">
			username<br><input class="inputId" type="text" name="username"><br>
			password<br> <input class="inputPw" type="text" name=password><br>
			<input type="submit" value="저장">
		</form>
	</div>
</body>
</html>