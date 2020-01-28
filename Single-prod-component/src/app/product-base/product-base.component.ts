import { Component, OnInit } from '@angular/core';
import { Product } from '../models/product.model';

@Component({
  selector: 'app-product-base',
  templateUrl: './product-base.component.html',
  styleUrls: ['./product-base.component.css']
})
export class ProductBaseComponent implements OnInit {
  //products :Product[];
  products : Array<Product>;

  constructor() {
    this.products = [
      new Product("First", "books", 100),
      new Product('Second', 'Electronics', 100),
      new Product('Third', 'Games', 100),
    ]
   }

  ngOnInit() {
  }

}
