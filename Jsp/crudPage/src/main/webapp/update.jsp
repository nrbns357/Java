<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="ex0405.MemberDBManager" %>
	<%@ page import="ex0405.Member" %>
	<%
	String id = request.getParameter("id");
	MemberDBManager mdn = new MemberDBManager();
	Member member = mdn.doselectone(id);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css?family=Black+Han+Sans:400"
	rel="stylesheet">
<link href="./mystyle.css" rel=stylesheet>
</head>
<body>
	<%@ include file="nav.jsp"%>
	<div class="main">
		<h1>Update 페이지</h1>
		<form action="updateproc.jsp">
		<input type="hidden" name="id" value="<%=id%>"/> 
			username<br> <input class="inputId" type="text" name="username" value="<%=member.getUsername()%>"><br>
			password<br> <input class="inputPw" type="text" name=password value="<%=member.getPassword()%>"><br>
			<input type="submit" value="수정">
		</form>
	</div>
</body>
</html>