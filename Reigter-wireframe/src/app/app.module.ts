import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { AsideInfoComponent } from './aside-info/aside-info.component';
import { NavlinkBarComponent } from './navlink-bar/navlink-bar.component';
import { AccBarComponent } from './acc-bar/acc-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationFormComponent,
    AsideInfoComponent,
    NavlinkBarComponent,
    AccBarComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
