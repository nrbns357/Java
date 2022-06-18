<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.example.homepageapp.MemberDBManager" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>
</body>
</html>

<%
    String ids[] = request.getParameterValues("id");
    MemberDBManager mdn = new MemberDBManager();
    mdn.dodelete(ids);
    out.println("<script>");
    out.println("swal(\'삭제 완료\',\"해당아이디를 삭제하였습니다.\",\"success\").then(function(){location.href='select.jsp'})");
    out.println("</script>");
%>