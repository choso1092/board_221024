signUpUser = function () {
    console.log("ttt");
    let userId = $("#inputEmail").val();
    let userPw = $("#inputPassword").val();
    let userName = $("#inputName").val();
    let telNum = $("#inputPhoneNumber").val();
    let address = $("#inputAddress").val();

    let param = {
        userId : userId
        , userPassword : userPw
        , userName : userName
        , phoneNumber : telNum
        , userAddress :address
    }
    $.ajax({
        url :"/signUp"
        , type :"POST"
        , data : param
        , success : function (data) {
            console.log(data);
            if (data.success) {
                alert("성공 햇습니다");
            } else {
                alert("실패 다시 시도해 주세여");
            }

        }, error : function (exception) {
            alert("실패 다시 시도해 주세여");

        }
        // , beforeSend :function (xhr) {
        //     xhr.setRequestHeader();
        // }
    })
}

checkForm = function () {
    let userId = $("#inputEmail").val();
    let userPw = $("#inputPassword").val();
    let userName = $("#inputName").val();
    let telNum = $("#inputPhoneNumber").val();
    let address = $("#inputAddress").val();

    /* TODO 여기서 이제 해당 값들이 빈값인지 체크 하는 로직을 작성*/

//    if(얘네가 다 빈값이 아니면) {
//    signUpUser(); //실행
//    }
    signUpUser();


}