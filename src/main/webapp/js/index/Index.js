/**
 * Created by YLBG-YCY-1325 on 2017/2/18.
 */
$(function(){
    loginOrReg();
})
function loginOrReg(){
    $("#login").click(function(){
        $(".login-black").css("display","block");
    });
    $(".close-login").click(function(){
        $(".login-black").css("display","none");
        $(".reg-bg-all").css("display","none");
    });
    $("#register").click(function(){
        $(".reg-bg-all").css("display","block");
    });
    $("#login-now").click(function () {
        $(".reg-bg-all").css("display","none");
        $(".login-black").css("display","block");
    });
    $("#reg-now").click(function(){
        $(".login-black").css("display","none");
        $(".reg-bg-all").css("display","block");
    })
}
function regUser(){
    var regUserName = $("#reg_userName").val();
    var regRealName = $("#reg_realName").val();
    var phone = $("#reg_phone").val();
    var regEmail = $("#reg_email").val();
    var rePassword = $("#re_password").val();

    $.ajax({
        type:"POST",
        url:"user/regUser.htm",
        dataType:"json",
        data:{
            userName:regUserName,
            realName:regRealName,
            phone:phone,
            email:regEmail,
            password:rePassword
        },
        success:function(data){
            alert(data);
        },
        error: function (data) {
            alert("error"+data);
        }
    })
}