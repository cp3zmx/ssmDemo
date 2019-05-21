$("#addUser").click(function(){
    var name = $("#name").val();
    var age = $("#age").val();
    var jobNo = $("#jobNo").val();
    var rank = $("#rank").val();
    var deptNo = $("#deptNo").val();
    /**
     * 添加数据
     */
    $.ajax({
        url:"user/add.htm",
        type:"post",
        data: {
            name:name,
            age:age,
            jobNo:jobNo,
            rank:rank,
            deptNo:deptNo
        },
        dateType:"json",
        success:function(result){
            alert(result.msg);
        }
    })

});