<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.example.homepageapp.*" %>
<!DOCTYPE html>
<html>
<head><script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script></head>
<body>
</body>
</html>

<%
String username = request.getParameter("username");
String password = request.getParameter("password");
String id = request.getParameter("id");

MemberDBManager mdn = new MemberDBManager();
mdn.doupdate(username, password, id);

    out.println("<script>");
    out.println("swal(\'수정 성공\',\"재미있게 사용하세요\",\"success\").then(function(){location.href='select.jsp'})");
    out.println("</script>");

%>