search = function () {
    let searchKey = $("#searchKey").val()
    let searchValue = $("#searchValue").val()

    let param = {
        searchKey: searchKey
        , searchValue: searchValue
    }
    $.ajax({
        url: "/board/getBoardList"
        , type: "POST"
        , data: param
        , success: function (data) {
            console.log(data);
            $("#viewList").empty();
            if (data.success) {
                if (data.data !=null && data.data.length>0) {
                    data.data.forEach(function (b) {
                        $("#viewList").append("<tr><td>"+b.boardNumber+"</td><td>"
                            +b.title+"</td><td>"
                            +b.userId+"</td><td>"+
                            b.boardTime+"</td></tr>");
                    })
                }
            } else {
                alert("실패했어요")
            }
        }, error: function (exception) {
            alert("실패했어요")
        }
    })
}
boardWrite = function () {
    let userId = $("#userId").val();
    location.href = "board/boardWrite?userId=" + userId;
}