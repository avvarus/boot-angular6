import {NgModule} from "@angular/core";
import {Routes, RouterModule} from "@angular/router";
import {FirstComponent} from "./first/first.component";
import {SecondComponent} from "./second/second.component";

const routes: Routes = [
  {path:'first', component:FirstComponent},
  {path:'second',component:SecondComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash: true})],
  exports: [RouterModule]
})

export class AppRoutingModule {}
export const routingComponents =[FirstComponent]

