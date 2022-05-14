<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link href="./mystyle.css" rel=stylesheet>
<%
String username = (String) session.getAttribute("username");
if (username == null) {
%>
<div class="loginDiv">
	<form class="loginForm" action="loginprop.jsp">
		<img
			src="https://o.remove.bg/downloads/a6547399-f330-489b-b528-11886b1ccc1c/image-removebg-preview.png" />
		<h1 class="textLogin">LogIn</h1>
		<div>
			<p>id</p>
			<input class="inputId" type="text" name="username" />
			</td>
		</div>
		<div>
			<p>pw</p>
			<input class="inputPw" type="password" name="password" />
		</div>
		<button class="loginBtn" type="submit" value="로그인">로그인</button>

	</form>
</div>
<%
} else {

out.println(username + "로그인 했음");
%>
<a href="logout.jsp">로그아웃</a>
<%
}
%>
