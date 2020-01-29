import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticateService } from './services/authenticate.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'route-base-app';

  constructor( private router : Router ,public auth : AuthenticateService){}

  searchCall(inp : HTMLInputElement){
    if(inp.value.length != 0){
      this.router.navigate(["/search/"+inp.value]);
    }
    else{
      inp.focus();
      alert("search is empty")
    }
      

  }


}

