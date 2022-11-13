
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>0
<head>
    <script src="../js/boardList.js"></script>
    <script src="../js/jquery-3.6.1.min.js"></script>
</head>
<body>
헬로우 게시판이다
</body>
<div style="display:flex;">
    <div class="search-area">
        <select id="searchKey">
            <option value="title">제목</option>
            <option value="content">내용</option>
            <option value="userId">작성자</option>
        </select>
        <input id="searchValue">
        <button class="btn btn-primary" type="button" onclick="search();">검색</button>
    </div>
    <input type="hidden" id="userId" value="${userId}">
    <button class="btn btn-primary" type="button" onclick="boardWrite();">글쓰기</button>
</div>
<table>
    <thead>
    <th>번호</th>
    <th>제목</th>
    <th>작성자</th>
    <th>작성일</th>
    </thead>
    <tbody id="viewList"></tbody>
</table>
</html>
<script>
    $(document).ready(function () {
        search();
    })
</script>
