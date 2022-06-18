<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.homepageapp.BoardManager" %>
<%@ page import="com.example.homepageapp.Board" %>
<%
    String idx = request.getParameter("idx");
    if (idx == null) idx = "1";
    BoardManager bm = new BoardManager();
    Board board = bm.doselectrow(Integer.parseInt(idx));
    bm.count(Integer.parseInt(idx));
%>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container">
    <h1>view.jsp</h1>
    <div class="low">
        <div class="col">
            <table class="table">
                <tr class="table-primary">
                    <th class="display-5"><%=board.getTitle()%>
                    </th>
                </tr>
                <tr class="table-primary">
                    <td><%=board.getWdate()%>
                    </td>
                </tr>
                <tr>
                    <td class="p-2" style="height: 20rem"><%=board.getContent()%>
                    </td>
                </tr>
<%--                <%if(board.getImg() != null){%>--%>
<%--                <tr>--%>
<%--                    <td><img style="max-height: 500px; max-width: 800px;" src="<%=board.getImg()%>"></td>--%>
<%--                </tr>--%>
<%--                <%}%>--%>
                <tr class="table-primary">
                    <td>작성자 : <%=board.getName()%>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <div class="mb-3">
        <%if(username!=null && username.equals(board.getName())){%>
        <a class="btn btn-primary" href="board.jsp">뒤로가기</a>
        <a class="btn btn-primary" href="modify.jsp?idx=<%=board.getIdx()%>">글수정</a>
        <a class="btn btn-primary" href="deleteproc.jsp?idx=<%=board.getIdx()%>">글삭제</a>
        <%}else{%>
        <a class="btn btn-primary" href="board.jsp">뒤로가기</a>
        <%}%>
    </div>
</div>
</body>
</html>
