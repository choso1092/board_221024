
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1 th:text="${board.title}">제목 입니다</h1>
  <p th:text="${board.content}">내용이 들어갑니다.</p>
</body>
</html>
