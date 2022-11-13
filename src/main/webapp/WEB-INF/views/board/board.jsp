
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
헬로우 게시판이다
</body>
<div style="display:flex;">
    <button class="btn btn-primary" type="button" onclick="boardWrite();">글쓰기</button>
</div>
</html>
<script>
    let boardWrite = function(){
        location.href = "board/boardWrite";
    }
</script>
