import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sample',
  templateUrl: './sample.component.html',
  styleUrls: ['./sample.component.css']
})
export class SampleComponent implements OnInit {
  name : String;
  age : Number;
  designation : String ;
  grades:number[]=[7,8,6,7,9,6,7,9,7,6,8,8,6,9,7];
 

  constructor() { 
    this.name = "Hari";
    this.age = 34;
    this.designation='manager';
  }

  changeIt() : void {
    this.name = "Ram";
    this.age = 23;
    this.designation="developer";
   
  }

  ngOnInit() {
  }

}
