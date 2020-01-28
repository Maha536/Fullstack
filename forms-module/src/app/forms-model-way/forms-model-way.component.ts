import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forms-model-way',
  templateUrl: './forms-model-way.component.html',
  styleUrls: ['./forms-model-way.component.css']
})
export class FormsModelWayComponent implements OnInit {
  pname : String;
  pcat : String;
  pcost : String;

  saveProduct(frm:any):void{
    this.pname = frm.name;
    this.pcat=frm.category;
    this.pcost=frm.cost;


  }



  constructor() { }

  ngOnInit() {
  }

}
