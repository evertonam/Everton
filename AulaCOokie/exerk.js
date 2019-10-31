$(function(){
$("#btn1").click(cadastrar);
$("#btn2").click(exibir);
});


function cadastrar(){
var rgm = $("#rgm").val();
$.cookie("rgm",rgm,{expires:5});
$.cookie("nome",$("#nome").val(),{expires:5});
$.cookie("ap1",$("#ap1").val(),{expires:5});
$.cookie("ap2",$("#ap2").val(),{expires:5});
limpasCampos();
};



function exibir (){
    document.cookieS("msg").innerHTML =   $.cookie("rgm")
}







function limpasCampos(){
$("#rgm").val("");
$("#nome").val("");
$("#ap1").val("");
$("#ap2").val("");

}