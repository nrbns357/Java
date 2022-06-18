<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <link href="login.css" rel="stylesheet">
    <title>배진홈페이지</title>
</head>
<body>
<div class="page-container">
    <div class="login-form-container shadow">
        <div class="login-form-right-side">
            <div class="top-logo-wrap">
            </div>
            <h1>JinLog</h1>
            <p>jinyoung's community </p>
        </div>
        <div class="login-form-left-side">
            <div class="login-top-wrap">
                <span>Don't have an account?</span>
                <a class="signUp" href="signUp.jsp">회원가입</a>
            </div>
            <form action="loginprop.jsp" class="login-input-container">
                <h1>LogIn</h1>
                <div class="login-input-wrap input-id">
                    <i class="far fa-envelope"></i>
                    <input placeholder="Email" name="username" type="text">
                </div>
                <div class="login-input-wrap input-password">
                    <i class="fas fa-key"></i>
                    <input placeholder="Password" name="password" type="password">
                </div>
                <div class="login-btn-wrap">
                    <button class="login-btn">Login</button>
                </div>
                <a class="signUp" href="index.jsp">Back</a>
            </form>

        </div>
    </div>
</div>
</body>
</html>