<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp" %>
    <link href="index.css" rel="stylesheet">
</head>
<body>
<%@include file="nav.jsp" %>
<div class="index">
    <div class="rain-window">
        <h1 id="title">JinYoung</h1>
        <div class="moon">
            <div class="crater-1"></div>
            <div class="crater-2"></div>
            <div class="crater-3"></div>
            <div class="crater-4"></div>
            <div class="crater-5"></div>
            <div class="crater-6"></div>
        </div>
        <div class="hill-b-1"></div>
        <div class="hill-b-2"></div>
        <div class="hill-b-3"></div>
        <div class="hill-b-4"></div>
        <div class="hill-f-0"></div>
        <div class="hill-f-1"></div>
        <div class="hill-f-2"></div>
        <div class="hill-f-3"></div>
        <div class="water-1"></div>
        <div class="water-2"></div>
        <div class="water-3"></div>
        <div class="water-4"></div>
        <div class="water-5"></div>
        <div class="water-6"></div>
        <div class="water-7"></div>
        <div class="water-8"></div>
        <div class="water-9"></div>
        <div class="water-2-1"></div>
        <div class="water-2-2"></div>
        <div class="water-2-3"></div>
        <div class="water-2-4"></div>
        <div class="water-2-5"></div>
        <div class="water-2-6"></div>
        <div class="water-2-7"></div>
        <div class="water-2-8"></div>
        <div class="water-2-9"></div>
        <div class="water-3-1"></div>
        <div class="water-3-2"></div>
        <div class="water-3-3"></div>
        <div class="water-3-4"></div>
        <div class="water-3-5"></div>
        <div class="water-3-6"></div>
    </div>
    <div class="container2">

        <div id="title2">

            <div>
                <a href="login.jsp">
                <img style="width: 450px;height: 300px" src="login.png">
                <h3>로그인</h3>
                </a>
            </div>
            <div>
                <a href="board.jsp">
                <img style="width: 450px;height: 300px" src="board.png">
                <h3>게시판</h3>
                </a>
            </div>
            <div>
                <a href="select.jsp">
                <img style="width: 450px;height: 300px" src="member.png">
                <h3>사용자</h3>
                </a>
            </div>
            <div><h1 class="miniTitle">JinYoung</h1></div>
        </div>
    </div>
</div>
</div>
<script>
    let title = document.getElementById('title');
    let title2 = document.getElementById('title2');
    window.addEventListener('scroll', function () {
        let value = window.scrollY;
        console.log(value);
        title.style.left= value+680+"px";
        title2.style.left= value-1030+"px";
    })
</script>
</body>
</html>
