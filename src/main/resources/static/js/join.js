signUpUser = function () {
    console.log("ttt");
    /*** 여기 선언된 변수 값들은 jsp 화면단에서 입력받은 value (내가 넣고 싶은)**/
    let InputUserId = $("#inputEmail").val();
    let userPw = $("#inputPassword").val();
    let userName = $("#inputName").val();
    let telNum = $("#inputPhoneNumber").val();
    let address = $("#inputAddress").val();
    /** Controller 에서 정보를 받을 때 받을 애들에 대한 값을 미리 선언해 둔게 Vo
     * Vo 에 있는 것들은 key
     * {key:value} 이 형식을 맞춰서 보내주는 건데
     * key 값은 Vo에 항상 있어야 함. 없으면 에러남 혹은 읽지 못해
     * 그리고 Vo가 어떤 Vo를 쓰는지는 Controller 에서 확인 할 수 있음
     * ()
     *}{}*/
    let param = {
        userId : InputUserId
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
                alert("실패했지롱");
            }

        }, error : function (exception) {
            alert("아예 실패했습니다");

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