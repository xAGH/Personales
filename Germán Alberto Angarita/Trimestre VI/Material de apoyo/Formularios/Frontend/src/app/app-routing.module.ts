import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AyudaComponent} from './ayuda/ayuda.component';
import { EjemplosComponent} from './ejemplos/ejemplos.component';


const routes: Routes = [
  {path: '', component: EjemplosComponent},
  {path: 'ayuda', component: AyudaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
