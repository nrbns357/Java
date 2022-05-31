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
    <a class="btn btn-primary" href="insert.jsp">글쓰기</a>
    <nav aria-label="Page navigation example">
        <ul class="pagination justify-content-center">
            <li class="page-item <%=(Integer.parseInt(pagenum)==1)?"disabled":""%> "><a class="page-link"  href="?pagenum=<%=Integer.parseInt(pagenum)-1%>">Previous</a></li>
            <%for(int i =1; i<pagecnt+1;i++) {%>
            <li class="page-item <%=(Integer.parseInt(pagenum)==i)?"active":""%>"><a class="page-link" href="?pagenum=<%=i%>"><%=i%></a></li>

            <%}%>
            <li class="page-item <%=(Integer.parseInt(pagenum)==pagecnt)?"disabled":""%>"><a class="page-link" href="?pagenum=<%=Integer.parseInt(pagenum)+1%>">Next</a></li>
        </ul>
    </nav>
</div>

</body>
</html>
