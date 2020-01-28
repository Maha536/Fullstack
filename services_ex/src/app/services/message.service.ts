import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MessageService {
  msg : String;

  constructor() { 
    this.msg = "Hello , All";
  }
  getMessage():String{
    return this.msg;
  }
}
