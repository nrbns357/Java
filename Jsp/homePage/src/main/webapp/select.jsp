<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.example.homepageapp.MemberDBManager" %>
<%@ page import="com.example.homepageapp.Member" %>
<%@ page import="java.util.List" %>
<%
    MemberDBManager mdn = new MemberDBManager();
    List<Member> list = mdn.doselect();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <link
            href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap"
            rel="stylesheet">
    <link href="./mystyle.css" rel=stylesheet>
</head>
<body>
<%@ include file="nav.jsp" %>
<div>

    <form action="delete.jsp">
        <div style="width: 80%; margin: auto">
			<h1>사용자</h1>
            <table class="table table-hover mt-3">
                <tr class="table" style="background-color: #cfe2ff">
                    <th>#</th>
                    <th>ID</th>
                    <th>USERNAME</th>
                    <th>PASSWORD</th>
                </tr>
                <%
                    for (Member member : list) {
                %>
                <tr>
                    <td><input type="checkbox" name="id"
                               value="<%=member.getId()%>"/></td>
                    <td><%=member.getId()%>
                    </td>
                    <td><a href="update.jsp?id=<%=member.getId()%>"><%
                        out.println(member.getUsername());
                    %>
                    </a></td>
                    <td><%=member.getPassword()%>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
            <button class="btn-primary" type="submit">삭제</button>
        </div>
    </form>
</div>
`
</body>
</html>