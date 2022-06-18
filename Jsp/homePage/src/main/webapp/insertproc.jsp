<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="com.example.homepageapp.BoardManager"%>
<%@ page import="com.example.homepageapp.Board"%>


<%@ page import="java.io.File" %>


<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>


<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String name = request.getParameter("name");
    String img = request.getParameter("img");
    Board board = new Board();
    board.setTitle(title);
    board.setName(name);
    board.setContent(content);
    board.setImg(img);


//    String uploadDir =this.getClass().getResource("").getPath();
//
//    uploadDir = uploadDir.substring(1,uploadDir.indexOf(".metadata"))+"uploadTest/WebContent/uploadImage";
//
//    int maxSize = 1024 * 1024 * 100;
//
//    String encoding = "UTF-8";
//
//    MultipartRequest multipartRequest
//
//            = new MultipartRequest(request, uploadDir, maxSize, encoding,
//
//            new DefaultFileRenamePolicy());
//
//
//    String fileRealName = multipartRequest.getFilesystemName("file");




    BoardManager bm  = new BoardManager();
    bm.doinsert(board);
    response.sendRedirect("board.jsp");
%>