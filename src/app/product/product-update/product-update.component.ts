import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductdataserviceService } from 'src/app/services/data/productdataservice.service';
import { Product } from 'src/app/models/product.model';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  id : number;
  product : Product;
  constructor(public route :ActivatedRoute,public pd:ProductdataserviceService,public router : Router) {
    this.route.params.subscribe((x) =>this.id = x["productId"])
   }
   upadteProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement){
      let product = new Product(this.id,txtName.value,txtCategory.value,txtCost.value);
      return this.pd.updateProduct(this.id,product).subscribe((responce)=> this.router.navigate(['/product']))
   }

  ngOnInit() {
    this.pd.getProduct(this.id).subscribe((responce:any)=> {this.product = responce});
  }

}
