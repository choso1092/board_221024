changeBoard = function (){
    let title = $("#inputTitle").val();
    let content = $("#inputContent").val();

    let param = {
        title : title,
        content : content
    }
    $.ajax({
        url : "/board/changeBoard"
        , type : "POST"
        , data : param
        , success : function (data){
            console.log(data);
            if(data.success){
                alert("수정에 성공했습니다")
            }else{
                alert("수정에 실패했습니다")
            }
        }, error : function (exception){
            alert("실패")
        }
    })
}