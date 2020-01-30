import { Component, OnInit } from '@angular/core';
import { ProductdataserviceService } from 'src/app/services/data/productdataservice.service';
import { Product } from 'src/app/models/product.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-base',
  templateUrl: './product-base.component.html',
  styleUrls: ['./product-base.component.css']
})
export class ProductBaseComponent implements OnInit {
  products : Array<Product>;
  constructor(private pd : ProductdataserviceService,public router:Router) { }

  addProduct(){
    this.router.navigate(['/product-add'])
  }
  updateProduct(id : number){
    this.router.navigate(['/product-update/'+id])
  }
  deleteProduct(id : number){
    this.pd.delete(id).subscribe((responce)=>this.pd.getProducts().subscribe((repsonce:any) => this.products=repsonce));
  }

  ngOnInit() {
    this.pd.getProducts().subscribe((repsonce:any) => this.products=repsonce);

  }

}
