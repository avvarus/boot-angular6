import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import {HttpClient} from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import {RouterModule,Routes} from "@angular/router";

import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import {AppRoutingModule, routingComponents} from "./app-routing.module";


//const routes: Routes =[{path:'/first',component:FirstComponent}]

@NgModule({
  declarations: [
    AppComponent,
    routingComponents
  ],
  imports: [
   // RouterModule.forRoot(routes),
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  //exports:[RouterModule]

})
export class AppModule { }
