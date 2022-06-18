
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="com.example.homepageapp.BoardManager"%>
<%
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String idx = request.getParameter("idx");
    BoardManager bm  = new BoardManager();
    bm.doupdate(Integer.parseInt(idx),title,content);
    response.sendRedirect("board.jsp");
%>