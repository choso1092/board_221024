<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title>치수의 게시판</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sign-in/">




    <script src="../js/login.js"></script>
    <script src="/js/jquery-3.6.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }

        .b-example-divider {
            height: 3rem;
            background-color: rgba(0, 0, 0, .1);
            border: solid rgba(0, 0, 0, .15);
            border-width: 1px 0;
            box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
        }

        .b-example-vr {
            flex-shrink: 0;
            width: 1.5rem;
            height: 100vh;
        }

        .bi {
            vertical-align: -.125em;
            fill: currentColor;
        }

        .nav-scroller {
            position: relative;
            z-index: 2;
            height: 2.75rem;
            overflow-y: hidden;
        }

        .nav-scroller .nav {
            display: flex;
            flex-wrap: nowrap;
            padding-bottom: 1rem;
            margin-top: -1px;
            overflow-x: auto;
            text-align: center;
            white-space: nowrap;
            -webkit-overflow-scrolling: touch;
        }
    </style>


    <!-- Custom styles for this template -->
    <link href="../css/signin.css" rel="stylesheet">
</head>
<body class="text-center">

<main class="form-signin w-100 m-auto">
        <img src="../image/CCS.jpg" style="width: 180px; margin-bottom: 10px">
        <h1 class="h3 mb-3 fw-normal">로그인</h1>

        <div class="form-floating">
            <input class="form-control" id="floatingInput" placeholder="id를 입력해주세요">
            <label for="floatingInput">ID address</label>
        </div>
        <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password를 입력해주세요">
            <label for="floatingPassword">Password</label>
        </div>

        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> 아이디기억하기
            </label>
        </div>
        <div style="display:flex;">
            <button class="w-50 btn btn-lg btn-secondary" style="margin-right:10px; background-color: #8080e0" type="button" onclick="loginChk();">로그인</button>
            <button class="w-50 btn btn-lg btn-secondary" style="background-color: #8080e0" type="button" onclick="gotoJoinPage();">회원가입</button>

        </div>
        <p class="mt-4 mb-3 text-muted">&copy; 2017 - 2022</p>
</main>

</body>
</html>
<script>

    let gotoJoinPage = function () {
        location.href = "/join";
    }

</script>

