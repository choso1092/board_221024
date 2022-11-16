<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<script>
    let test = '${boardDetail}';
</script>
<body>
  <h1 class="title">${boardDetail.title}</h1>
  <p class="content">${boardDetail.content}</p>
</body>
</html>
