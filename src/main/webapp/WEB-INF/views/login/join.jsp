
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<form method="post" action="/signUp">
    <div class="container">
        <h1>회원가입</h1>
        <div class="form-group">
            <label for="inputEmail4">userId</label>
            <input type="text" class="form-control" id="inputEmail4" name="userId" placeholder="사용자 아이디">
        </div>
        <div class="form-group">
            <label for="inputPassword4">password</label>
            <input type="password" class="form-control" id="inputPassword4" name="userPw" placeholder="사용자 비밀번호">
        </div>
        <div class="form-group">
            <label for="inputName">userName</label>
            <input type="text" class="form-control" id="inputName" name="userName" placeholder="사용자 이름">
        </div>
        <div class="form-group">
            <label for="inputphoneNumber4">phoneNumber</label>
            <input type="text" class="form-control" id="inputphoneNumber4" name="userphoneNumber" placeholder="사용자 연락처">
        </div>
        <div class="form-group">
            <label for="inputAddress">phoneNumber</label>
            <input type="text" class="form-control" id="inputAddress" name="userAddress" placeholder="사용자 주소">
        </div>
        <button type="submit" class="btn btn-primary">가입 완료</button>
    </div>
</form>
</body>
</html>
