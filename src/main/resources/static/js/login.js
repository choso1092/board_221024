
function loginChk() {

    let param = {
        userId: $('#floatingInput').val(),
        userPassword: $('#floatingPassword').val()
    }
    $.ajax({
        url: "/loginTest"
        , type: "POST"
        , data: param
        , success: function (data) {
            console.log(data);
            if (data.success) {
                gotoBoardPage();
            } else {
                alert("로그인 정보가 없습니다.");
            }
        },
        error: function () {
            alert("err");
        }
    });
}

gotoBoardPage = function (){
    location.href = "/board"
}