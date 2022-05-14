<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="ex0405.MemberDBManager" %>
<%
	String username = request.getParameter("username");
	String password  = request.getParameter("password");
	

	MemberDBManager mdn = new MemberDBManager();
	mdn.loginchk(username,password);
	boolean ret = mdn.loginchk(username, password);
	if(ret){
		session.setAttribute("username", username);
		response.sendRedirect("index.jsp");
	}else{
		out.println("<script>");
		out.println("alert('아이디 비밀번호 확인 하세요')");
		out.println("location.href='login.jsp'");
		out.println("</script>");
	}
	
%>