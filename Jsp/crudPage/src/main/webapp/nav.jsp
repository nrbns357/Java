<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="outDiv">
	<div class="container">
		<div class="DGSW">
			<h1>DGSW</h1>

			<%
			String username = (String) session.getAttribute("username");
			if (username == null) {
			%>

			<a class="goLoginBtn" href="login.jsp">로그인</a>
			<%
			} else {

			out.println(username + "로그인 했음");
			%>
			<a class="goLogoutBtn" href="logout.jsp">로그아웃</a>
			<%
			}
			%>
		</div>
		<div class="navdiv">
			<ul class="navLsit">
				<li class="navListli"><a href="index.jsp">index</a></li>
				<li class="navListli"><a href="insert.jsp">insert</a></li>
				<li class="navListli"><a href="select.jsp">select</a></li>
			</ul>
		</div>
	</div>
</div>