import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { AuthenticateService } from './authenticate.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {
  
  //receive auth service
  constructor(public auth : AuthenticateService,public router : Router) { }

canActivate(route: import("@angular/router").ActivatedRouteSnapshot, state: import("@angular/router").RouterStateSnapshot): boolean | import("@angular/router").UrlTree | import("rxjs").Observable<boolean | import("@angular/router").UrlTree> | Promise<boolean | import("@angular/router").UrlTree> {
  if(this.auth.isUserLoggedin())
    return true;
  else{
    this.router.navigate(['/login/']);
    return false;
  }
    
  throw new Error("Method not implemented.");
 
  
}
}