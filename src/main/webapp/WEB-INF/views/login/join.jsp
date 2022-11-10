
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="../js/join.js"></script>
    <script src="/js/jquery-3.6.1.min.js"></script>
    <title>회원가입</title>
</head>
<form method="post" action="/signUp">
    <div class="container">
        <h1>회원가입</h1>
        <div class="form-group">
            <label for="inputEmail">userId</label>
            <input type="text" class="form-control" id="inputEmail" name="userId" placeholder="사용자 아이디">
        </div>
        <div class="form-group">
            <label for="inputPassword">password</label>
            <input type="password" class="form-control" id="inputPassword" name="userPw" placeholder="사용자 비밀번호">
        </div>
        <div class="form-group">
            <label for="inputName">userName</label>
            <input type="text" class="form-control" id="inputName" name="userName" placeholder="사용자 이름">
        </div>
        <div class="form-group">
            <label for="inputPhoneNumber">phoneNumber</label>
            <input type="text" class="form-control" id="inputPhoneNumber" name="userphoneNumber" placeholder="사용자 연락처">
        </div>
        <div class="form-group">
            <label for="inputAddress">phoneNumber</label>
            <input type="text" class="form-control" id="inputAddress" name="userAddress" placeholder="사용자 주소">
        </div>
        <button type="button" class="btn btn-primary" onclick="signUpUser();">가입 완료</button>
    </div>
</form>
</body>
</html>
