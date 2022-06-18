<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ page import="com.example.homepageapp.MemberDBManager" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script></head>
<body>
</body>
</html>
<%
	String username = request.getParameter("username");
	String password  = request.getParameter("password");

	MemberDBManager mdn = new MemberDBManager();
	mdn.loginchk(username,password);
	boolean ret = mdn.loginchk(username, password);
	if(ret){
		session.setAttribute("username", username);
		out.println("<script>");
		out.println("swal(\'로그인 성공\',\"재미있게 사용하세요\",\"success\").then(function(){location.href='index.jsp'})");
		out.println("</script>");
	}else{
		out.println("<script>");
		out.println("swal(\'로그인 실패\',\"아이디나 비밀번호가 틀렸습니다.\",\"warning\").then(function(){location.href='login.jsp'})");
		out.println("</script>");
	}
	
%>