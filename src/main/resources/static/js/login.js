
function loginChk() {
    let userId =$('#floatingInput').val();
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
                 gotoBoardPage(userId);
                // gotoBoardPage();
            } else {
                alert("로그인 정보가 없습니다.");
            }
        },
        error: function () {
            alert("err");
        }
    });
}

gotoBoardPage = function (userId){
    location.href = "/board?userId="+ userId;
}

// gotoBoardPage = function (){
//     location.href = "/board/boardSession";
//}
