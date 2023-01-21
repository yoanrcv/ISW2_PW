function campCI(){
    
    var x = document.getElementById("CI").value;
   for(i=0;i< x.length;i++){
   
       if(x.charAt(i) == "[]"){
           alert("solo hasta 11 números")
       }
    }
}