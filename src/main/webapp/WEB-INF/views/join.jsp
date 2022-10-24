<%--
  Created by IntelliJ IDEA.
  User: passo
  Date: 2022-04-29
  Time: 오후 1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/joinProgress" method="post">
        <div class="form-floating">
            <input type="text"
                   class="form-control"
                   id="userId"
                   name="userId"
                   placeholder="enter your ID"
                   required
            >
            <label for="userId">ID</label>
        </div>
        <div class="form-floating">
            <input type="text"
                   class="form-control"
                   id="userName"
                   name="userName"
                   placeholder="enter your Name"
                   required
            >
            <label for="userName">Name</label>
        </div>
        <div class="form-floating">
            <input type="password"
                   class="form-control"
                   id="userPw"
                   name="userPw"
                   placeholder="enter your Password"
                   required
            >
            <label for="userPw">PW</label>
        </div>
        <button class="w-100 btn btn-lg btn-primary" type="submit">Join</button>
    </form>
</body>
</html>
