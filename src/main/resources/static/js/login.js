$ (document).ready(function (){
    $('login_btn').on('click', function(){
        loginChk();
    })
});

function loginChk() {
    $.ajax({
        url: "/login"
        , type: "POST"
        , data: {
            id: $('#id').val(),
            pw: $('#pw').val()
        },
        success: function (data) {
            alert(data.Msg);
        },
        error: function () {
            alert("err");
        }
    });
}

