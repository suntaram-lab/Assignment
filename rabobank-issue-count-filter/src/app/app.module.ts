import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {FileUtil} from "./util/file.util";
import {NumericRangeFilterPipe} from "./pipe/numeric-range-filter.pipe";
import {RemoveQuotes} from "./pipe/remove-quotes.pipe";
import {RouterModule} from "@angular/router";
import {HttpModule} from "@angular/http";
import {AppRoutingModule} from "./app-route.module";
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    RemoveQuotes,
    NumericRangeFilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HttpModule
  ],
  providers: [
    FileUtil
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
