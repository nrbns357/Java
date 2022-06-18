<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="com.example.homepageapp.BoardManager"%>
<%@ page import="com.example.homepageapp.Board"%>
<%
    String idx = request.getParameter("idx");

    BoardManager bm  = new BoardManager();
    bm.dodelete(Integer.parseInt(idx));
    response.sendRedirect("board.jsp");
%>