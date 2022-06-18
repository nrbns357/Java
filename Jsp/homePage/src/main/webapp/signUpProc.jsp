<%@page import="com.example.homepageapp.MemberDBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head><script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script></head>
<body>
</body>
</html>
<%
	String u = request.getParameter("username");
	String p = request.getParameter("password");
	
	MemberDBManager mdn = new MemberDBManager();
	mdn.doInsert(u, p);
	out.println("<script>");
	out.println("swal(\'회원가입 성공\',\"회원가입이 완료되었습니다.\",\"success\").then(function(){location.href='login.jsp'})");
	out.println("</script>");
%>