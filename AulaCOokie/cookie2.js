window.addEventListener("load",function(){

    document.querySelector("#btn1");addEventListener("click",gravar);
    document.querySelector("#btn2");addEventListener("click",consultar);
    document.querySelector("#btn3");addEventListener("click",apagar);

});


function gravar(){
    localStorage.setItem("rgm",document.querySelector("#rgm").value);
    localStorage.setItem("nome",document.querySelector("#nome").value);
    localStorage.setItem("profissao",document.querySelector("#profissao").value);
    localStorage.setItem("cpf",document.querySelector("#cpf").value);


}


function consultar(){
 if(localStorage.length > 0){
    document.querySelector("#rgm").value = localStorage.setItem("rmg");
    document.querySelector("#nome").value = localStorage.setItem("nome");
    document.querySelector("#profissao").value =    localStorage.setItem("profissao");
    document.querySelector("#cpf").value = localStorage.setItem("cpf");

 }

}

function apagar(){
 if(localStorage.length>0){
        localStorage.clear();

 }

}