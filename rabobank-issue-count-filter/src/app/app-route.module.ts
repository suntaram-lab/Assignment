import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {HomeComponent} from "./home/home.component";

const APP_ROUTE: Routes = [
    {path: '', component: HomeComponent}
  ]
;

@NgModule({
  imports: [RouterModule.forRoot(APP_ROUTE)],
  declarations: [],
  entryComponents: []
})
export class AppRoutingModule {
}
