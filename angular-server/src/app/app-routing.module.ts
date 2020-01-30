import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchResultComponent } from './search-result/search-result.component';

import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './services/auth-guard.service';
import { ErrorComponent } from './error/error.component';
import { ProductBaseComponent } from './product/product-base/product-base.component';
import { ProductAddComponent } from './product/product-add/product-add.component';
import { ProductUpdateComponent } from './product/product-update/product-update.component';
import { MediaBaseComponent } from './media/media-base/media-base.component';
import { MediaAddComponent } from './media-add/media-add.component';
import { MediaUpdateComponent } from './media-update/media-update.component';


const routes: Routes = [
  {path:"",redirectTo:"home",pathMatch:"full"}, 
  {path:"home",component:HomeComponent}, 
  {path:"contact",component:ContactComponent},
  {path:"about",component:AboutComponent},
  {path:"product-add",component:ProductAddComponent,canActivate:[AuthGuardService]},
  {path:"media-add",component:MediaAddComponent,canActivate:[AuthGuardService]},
  {path:"product-update/:productId",component:ProductUpdateComponent,canActivate:[AuthGuardService]},
  {path:"media-update/:mediaId",component:MediaUpdateComponent,canActivate:[AuthGuardService]},
  {path:"product",component:ProductBaseComponent,canActivate:[AuthGuardService]},
  {path:"media",component:MediaBaseComponent,canActivate:[AuthGuardService]},
  {path:"login",component:LoginComponent},
  {path:"logout",component:LogoutComponent,canActivate:[AuthGuardService]},
  {path:"search/:searchText",component:SearchResultComponent},
  {path:"**",component:ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
