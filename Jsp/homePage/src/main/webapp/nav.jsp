<nav class="navbar navbar-expand-sm navbar-dark bg-primary">
    <div class="container-fluid ">
        <a class="navbar-brand" href="index.jsp">JinLog</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/board.jsp">BOARD</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/select.jsp">MEMBER</a>
                </li>
            </ul>
        </div>
        <%
            String username = (String) session.getAttribute("username");
            if (username == null) {
        %>
        <a style="color: white; text-decoration: none" href="login.jsp">Login</a>
        <% }else{ %>
        <a class="" style="color: white; text-decoration: none">Hello! <%=username%></a>
              <a style="color: white; text-decoration: none; margin-left: 5px;margin-right: 5px; " href="logout.jsp">LogOut</a>
        <%}%>
    </div>
</nav>