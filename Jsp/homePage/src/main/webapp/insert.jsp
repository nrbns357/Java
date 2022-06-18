<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.homepageapp.BoardManager" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.homepageapp.Board" %>

<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

</head>
<body>
<%@ include file="nav.jsp" %>
<%
    String url = null;
    if (username == null) {
out.println("<script>");
out.println("swal(\'로그인을 해주세요!\',\"로그인을 하면 더 다양한 기능을 사용하실 수 있습니다.\",\"info\").then(function(){location.href='login.jsp'})");
out.println("</script>");
} else {%>
<div class="container">
<h1>insert.jsp</h1>
    <form action="insertproc.jsp">
        제목 <input class="form-control mb-3" name="title" placeholder="title" required>
        <textarea class="form-control mb-3" placeholder="내용을 입력하세요" rows="10" name="content"></textarea>
<%--        <input type="file" id="upload_file" accept="image/*" value="업로드" formmethod="post" name="img" formenctype="multipart/form-data"><br>--%>
        작성자 <input class="form-control mb-3 mt-3" value="<%=username%>" type="text" name="name" placeholder="name" readonly>
        <input class="btn btn-primary" type="submit" value="저장">
    </form>
</div>
<%}%>
</body>
</html>
