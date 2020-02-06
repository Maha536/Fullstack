
function calculate(src){
                
    var val1=document.getElementById('ip1').value;
    var val2=document.getElementById('ip2').value;
    if( val1.length==0 || val2.length==0 || isNaN(Number(val1)) || isNaN(Number(val2)))
    {
        if(val1.length ==0 || val2.length==0)
            document.getElementById("error").innerHTML="Value is Empty";
        else
            document.getElementById("error").innerHTML="Invalid value type";
    }
    else{
        switch(src.value.trim()){
            case "+" : var res = Number(val1)+Number(val2);
                        var k =document.getElementById('rstxt');
                        k.value=res;
                        break;
            case "-" : var res = Number(val1)-Number(val2);
                        var k =document.getElementById('rstxt');
                        k.value=res;
                        break;
            case "*" : var res = Number(val1)*Number(val2);
                        var k =document.getElementById('rstxt');
                        k.value=res;
                        break;
            case "/" : var res = Number(val1)/Number(val2);
                        var k =document.getElementById('rstxt');
                        k.value=res;
                        break;
        }            
    }
}
       