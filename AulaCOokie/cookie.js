$(function(){
    $("#btn1").click(gravar);
    $("#btn2").click(consultar);
    $("#btn3").click(apagar);
});


function gravar(){
 var rgm = $("#rgm").val();
 $.cookie("rgm",rgm,{expires:5});
 $.cookie("nome",$("#nome").val(),{expires:5});
 $.cookie("cpf",$("#cpf").val(),{expires:5});
 $.cookie("profissao",$("#profissao").val(),{expires:5});
 limpasCampos();
};



function consultar (){
 if($.cookie("rgm") != null)
    $("#rgm").val($.cookie("rgm"));
    $("#nome").val($.cookie("nome"));
    $("#profissao").val($.cookie("profissao"));
    $("#cpf").val($.cookie("cpf"));
}


function apagar(){
 if($.cookie("rgm") != null){
    $.removeCookie("rgm");
    $.removeCookie("nome");
    $.removeCookie("profissao");
    $.removeCookie("cpf");

 }

}


function limpasCampos(){
 $("#rgm").val("");
 $("#nome").val("");
 $("#profissao").val("");
 $("#cpf").val("");

}