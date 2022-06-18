<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.example.homepageapp.MemberDBManager" %>
<%@ page import="com.example.homepageapp.Member" %>
<%
    String id = request.getParameter("id");
    MemberDBManager mdn = new MemberDBManager();
    Member member = mdn.doselectone(id);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@include file="head.jsp"%>
    <link href="login.css" rel="stylesheet">
</head>
<body>
<%@ include file="nav.jsp" %>

<div class="page-container">
    <div class="login-form-container shadow">
        <div class="login-form-right-side">
            <div class="top-logo-wrap">
            </div>
            <h1>JinLog</h1>
            <p>jinyoung's community </p>
        </div>
        <div class="login-form-left-side">
            <form action="updateproc.jsp" class="login-input-container">
                <h1>정보수정</h1>
                <div class="login-input-wrap input-id">
                    <i class="far fa-envelope"></i>
                    <input type="text" name="username" value="<%=member.getUsername()%>">
                    <input type="text" name="id" value="<%=id%>" hidden>
                </div>
                <div class="login-input-wrap input-password">
                    <i class="fas fa-key"></i>
                    <input  type="text" name=password value="<%=member.getPassword()%>">
                </div>
                <div class="login-btn-wrap">
                    <button class="login-btn">수정</button>
                </div>
                <a class="signUp" href="select.jsp">Back</a>
            </form>

        </div>
    </div>
</body>
</html>