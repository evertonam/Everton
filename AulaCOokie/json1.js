window.addEventListener("load",function(){
  document.getElementById("btn").addEventListener("click",function(){


 function carregarDados(){
  if (localStorage.length > 0)
  {
  $("#rgm").val(localStorage.getItem("rgm"));
  $("#nome").val(localStorage.getItem("nome"));
  $("#parcial").val(localStorage.getItem("parcial"));
  $("#projeto").val(localStorage.getItem("projeto"));
  $("#regimental").val(localStorage.getItem("regimental"));  
  }
 
}    
})
})