import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavComponent } from './components/nav/nav.component';
import { AyudaComponent } from './components/ayuda/ayuda.component';
import { ContenedorAyudaComponent } from './components/contenedor-ayuda/contenedor-ayuda.component';
import { ContenedorQuienesComponent } from './components/contenedor-quienes/contenedor-quienes.component';
import { FooterComponent } from './components/footer/footer.component';
import { RegistroComponent } from './components/registro/registro.component';
import { ContenedorRaizComponent } from './components/contenedor-raiz/contenedor-raiz.component';
import { QuienesComponent } from './components/quienes/quienes.component';

@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    AyudaComponent,
    ContenedorAyudaComponent,
    ContenedorQuienesComponent,
    ContenedorRaizComponent,
    FooterComponent,
    RegistroComponent,
    QuienesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
