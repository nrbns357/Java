<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.freeboard.BoardManager" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.freeboard.Board" %>
<%
    BoardManager bm = new BoardManager();
    List<Board> list = bm.doselect();
%>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container">
    <h1>board.jsp</h1>
    <table class="table table-hover">
        <thead>
        <tr class="table-primary">
            <th scope="col">순번</th>
            <th scope="col">타이틀</th>
            <th scope="col">작성자</th>
            <th scope="col">작성일자</th>
            <th scope="col">조회수</th>
        </tr>
        </thead>
        <tbody>
        <% for(Board board : list){%>
        <tr>
            <th scope="row"><%=board.getIdx()%></th>
            <td><%=board.getTitle()%></td>
            <td><%=board.getName()%></td>
            <td><%=board.getWdate()%></td>
            <td><%=board.getCount()%></td>
        </tr>
        <%}%>
        </tbody>
    </table>
</div>
</body>
</html>
