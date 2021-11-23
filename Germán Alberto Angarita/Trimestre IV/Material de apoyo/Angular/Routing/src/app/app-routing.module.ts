import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContenedorAyudaComponent } from './components/contenedor-ayuda/contenedor-ayuda.component';
import { ContenedorQuienesComponent } from './components/contenedor-quienes/contenedor-quienes.component';
import { ContenedorRaizComponent } from './components/contenedor-raiz/contenedor-raiz.component';

const routes: Routes = [
  { path: '', component:ContenedorRaizComponent },
  { path: 'ayuda', component: ContenedorAyudaComponent},
  { path: 'quienes', component: ContenedorQuienesComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
