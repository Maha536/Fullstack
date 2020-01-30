import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product.model';
import { ProductdataserviceService } from 'src/app/services/data/productdataservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  constructor(private pd : ProductdataserviceService,public router:Router) { }
  
  saveProduct(txtId:HTMLInputElement,txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    // create a new Product Object from coming values 
    let product = new Product(txtId.value,txtName.value, txtCategory.value, parseInt(txtCost.value));
   
    this.pd.addNewProduct(product).subscribe((responce:any)=>{this.router.navigate(['/product']);})
    
    

    // reset the form
    txtId.value='';
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
}


  ngOnInit() {
    

  }
  

}
