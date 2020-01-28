import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-string-check',
  templateUrl: './string-check.component.html',
  styleUrls: ['./string-check.component.css']
})
export class StringCheckComponent implements OnInit {
  result : String;
  constructor() { }

  checkString(txt : HTMLInputElement){
    let a = txt.value;
    /*let matches = a.match(/\d+/g);
    console.log(matches);
    
    if(matches == null)
      this.result = "It has no digits." ;
    else
      this.result = "It has digit in it." ;
    */
      txt.value = '';
      for(let i=0;i<a.length;i++){
        console.log(a.charAt(i))
        console.log(Number(a.charAt(i)))
        if(Number(a.charAt(i)) >= 0 && Number(a.charAt(i)) <= 9){
          this.result = "It has digit in it."
            return
        }      
      }
      this.result = "It has no digits." ;
  }
  ngOnInit() {
  }

}
