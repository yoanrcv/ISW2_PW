function campnomb(){
    
 var x = document.getElementById("nombre").value;
for(i=0;i< x.length;i++){

    if(x.charAt(i) == "3"){
        alert("no se acepta el valor")
}
 }
}
 function campapellid(){
    
 var x = document.getElementById("nombre").value;
for(i=0;i< x.length;i++){

    if(x.charAt(i) == "5"){
        alert("no se acepta el valor")
}
 }
}
function campid(){
valor = document.getElementById("id").value;
var letras = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

if( !(/^\d{11}[A-Z]$/.test(valor)) ) {
  return false;
}

if(valor.charAt(11) != letras[(valor.substring(0, 11))%23]) {
  return false;
}
 

}
  
    