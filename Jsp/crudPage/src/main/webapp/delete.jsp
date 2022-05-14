<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="ex0405.MemberDBManager" %>
	<%@ page import="ex0405.Member" %>
<%
String ids[] = request.getParameterValues("id");
for(int i=0; i<ids.length;i++)
	out.println(ids[i]);
MemberDBManager mdn = new MemberDBManager();
mdn.dodelete(ids);
String result = mdn.dodelete(ids);
if(result.equals("success"))
	response.sendRedirect("select.jsp");
%>