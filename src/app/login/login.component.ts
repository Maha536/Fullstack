import { Component, OnInit } from '@angular/core';
import { AuthenticateService } from '../services/authenticate.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  errorMsg : string;
  authorized : boolean;
  constructor(public auth : AuthenticateService,public router:Router) { 
    this.errorMsg="Invalid Credentials...";
    this.authorized = true;
  }
  checkLogin(txtuname : HTMLInputElement,txtpassword:HTMLInputElement){

    //need a service
    if(this.auth.authenticate(txtuname.value,txtpassword.value)){
      this.router.navigate(['/product'])
    }else{
      this.authorized = false;
    }
  }

  ngOnInit() {
  }

}
