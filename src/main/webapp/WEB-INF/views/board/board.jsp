
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <script src="../js/jquery-3.6.1.min.js"></script>
</head>
<body>
헬로우 게시판이다
</body>
<div style="display:flex;">
    <input type="hidden" id="userId" value="${userId}">
    <button class="btn btn-primary" type="button" onclick="boardWrite();">글쓰기</button>
</div>
</html>
<script>
    let boardWrite = function(){
        let userId = $("#userId").val();
        location.href = "board/boardWrite?userId="+ userId;
    }
</script>
