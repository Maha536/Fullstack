import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
    num1 : number; 
    num2 : number;
    errortxt : String;
    rstxt : String = '';
  calculate(value1:HTMLInputElement,value2:HTMLInputElement,op:String):void{
    if (isNaN(Number(value1.value)) || isNaN(Number(value2.value))) {
      if ( value1.value.length==0 || value2.value.length==0)
        this.errortxt = "Empty Input"
      else
        this.errortxt = "Invalid Input";
    }
    else{
      this.num1= Number(value1.value);
      this.num2=Number(value2.value);
      
      switch(op){
        
        case "+": this.rstxt=String(this.num1 + this.num2);
                  break;
        case "-": this.rstxt=String(this.num1 - this.num2);
                  break;
        case "*": this.rstxt=String(this.num1 * this.num2);
                  break;
        case "/": this.rstxt=String(this.num1 / this.num2);
                  break;
      }
    }
    

  }
  reset(value1:HTMLInputElement,value2:HTMLInputElement,rstxt:HTMLInputElement):void{
    value1.value='';
    value2.value='';
    this.rstxt='';
  }

  ngOnInit() {
  }

}
