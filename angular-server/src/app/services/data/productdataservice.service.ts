import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from 'src/app/models/product.model';
const API_URL ="http://localhost:3000/products";
@Injectable({
  providedIn: 'root'
})

//
export class ProductdataserviceService {
  
  constructor(public http : HttpClient) { 

  }
  getProducts(){
    //send a req to server to get all the products
    return this.http.get(API_URL);
  }
  getProduct(id : number){
    return this.http.get(API_URL+"/"+id);

  }
  updateProduct(id:number ,product:Product){
    return this.http.put(API_URL+"/"+id,product);
  }
  addNewProduct(product : Product){
    return this.http.post(API_URL,product)
  }
  delete(id:number){
    return this.http.delete(API_URL+"/"+id);
  }
}
