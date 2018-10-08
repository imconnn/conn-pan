function sub() {
    var username=loginfo.username.value;
    var password=loginfo.password.value;
    $.ajax({
        url:'/potal/login',
        type:'POST', //GET
        async:true,    //或false,是否异步
        data:{
            'account':username,
            'password':password,
        },
        dataType:'json',    //返回的数据格式：json/xml/html/script/jsonp/text
        success:function(data){
            data.result==true?window.location.href='ss.html':alert("请确认后输入");
        }
    });
}