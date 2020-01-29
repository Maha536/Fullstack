import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticateService {

  constructor() { }
  //check uid and pwd
  authenticate(userid:string,password : string):boolean{
    //hard code validation
    if(userid==="First" && password === "abc"){
      sessionStorage.setItem("user",userid);
      return true
    } 
    else
      return false
  }
  isUserLoggedin():boolean{
    //// to check whether user is logged in
    let user = sessionStorage.getItem('user')
    if(user == null)
      return false
    return true
    
  }

  logout(){
    //to logout remove key
    console.log("Logged out");
    sessionStorage.removeItem('user');
    //sessionStorage.clear()
    
  }
  //get user details
  getUserDetails():string{
    let user =sessionStorage.getItem('user');
    return user;
  } 
}



