<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.homepageapp.BoardManager" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.homepageapp.Board" %>
<%
    String idx = request.getParameter("idx");
    if (idx == null) idx = "1";
    BoardManager bm = new BoardManager();
    Board board = bm.doselectrow(Integer.parseInt(idx));
%>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
</head>
<body>
<%@ include file="nav.jsp" %>
<div class="container">
    <h1>수정</h1>
    <fo class="low">
        <form action="modifyproc.jsp">
            <table class="table">
                <tr class="table-primary">
                    <th class="display-5"><input type="text" name="title" value="<%=board.getTitle()%>" required>
                    </th>
                </tr>
                <tr class="table-primary">
                    <td><%=board.getWdate()%>
                    </td>
                </tr>
                <tr>
                    <td class="p-2" style="height: 20rem"><textarea style="height: 20rem; width: 100%" type="text" name="content"><%=board.getContent()%></textarea>
                    </td>
                </tr>
                <tr class="table-primary">
                    <td>작성자 : <%=board.getName()%>
                    </td>
                </tr>
            </table>
            <input type="hidden" name="idx" value="<%=board.getIdx()%>"/>
            <input type="submit" value="수정" class="btn btn-primary">
<%--            <a class="btn btn-primary" href="updateproc.jsp?idx=<%=board.getIdx()%>&content=<%=board.getContent()%>&title=<%=board.getTitle()%>">확인</a>--%>
        </form>
    <div class="mb-3">

    </div>
</div>
</body>
</html>
