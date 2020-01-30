import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { MenuComponent } from './menu/menu.component';
import { SearchResultComponent } from './search-result/search-result.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { ErrorComponent } from './error/error.component';
import { ProductBaseComponent } from './product/product-base/product-base.component';
import { ProductAddComponent } from './product/product-add/product-add.component';
import { ProductUpdateComponent } from './product/product-update/product-update.component';
import { MediaBaseComponent } from './media/media-base/media-base.component';
import { MediaAddComponent } from './media-add/media-add.component';
import { MediaUpdateComponent } from './media-update/media-update.component';


@NgModule({
  declarations: [
    AppComponent,
    ContactComponent,
    HomeComponent,
    AboutComponent,
    MenuComponent,
    SearchResultComponent,
    LoginComponent,
    LogoutComponent,
    ErrorComponent,
    ProductBaseComponent,
    ProductAddComponent,
    ProductUpdateComponent,
    MediaBaseComponent,
    MediaAddComponent,
    MediaUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
