import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Product } from '../models/product.model';

@Component({
  selector: 'app-product-entry',
  templateUrl: './product-entry.component.html',
  styleUrls: ['./product-entry.component.css']
})
export class ProductEntryComponent implements OnInit {
  //declare event obj
  @Output()
  submit_info : EventEmitter<Product>;


  saveProduct(pname:HTMLInputElement,pcategory:HTMLInputElement,pcost:HTMLInputElement):void{
    let p = new Product(pname.value,pcategory.value,parseInt(pcost.value));
    
    //send p object to product-base component
    //by onvoking an event
    this.submit_info.emit(p);

    //resetting
    pname.value='';
    pcategory.value='';
    pcost.value='';

   }
  constructor() { 
    this.submit_info = new EventEmitter();
  }

  ngOnInit() {
  }

}
