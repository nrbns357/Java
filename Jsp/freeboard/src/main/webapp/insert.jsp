<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.freeboard.BoardManager" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.freeboard.Board" %>
<%
    String pagenum = request.getParameter("pagenum");
    if(pagenum==null) pagenum="1";
    BoardManager bm = new BoardManager();
    List<Board> list = bm.doselect(Integer.parseInt(pagenum));
    int pagecnt = bm.getPageCnt();
%>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container">
<h1>insert.jsp</h1>
    <form action="insertproc.jsp">
        제목 <input class="form-control mb-3" name="title" placeholder="title">
        <textarea class="form-control mb-3" placeholder="내용을 입력하세요" rows="10" name="content"></textarea>
        작성자 <input class="form-control mb-3" type="text" name="name" placeholder="name">
        <input class="btn btn-primary" type="submit" value="저장">
    </form>
</div>
</body>
</html>
