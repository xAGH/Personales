import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { ModuloClinicoComponent } from './components/modulo-clinico/modulo-clinico.component';
import { OpcionesMenuComponent } from './components/opciones-menu/opciones-menu.component';
import { ModuloLoginComponent } from './components/modulo-login/modulo-login.component';
import { FormularioLoginComponent } from './components/formulario-login/formulario-login.component';
import { ModuloAdministrativoPacientesComponent } from './components/modulo-administrativo-pacientes/modulo-administrativo-pacientes.component';
import { OpcionesAdministrativoPacientesComponent } from './components/opciones-administrativo-pacientes/opciones-administrativo-pacientes.component';
import { ModuloContableComponent } from './components/modulo-contable/modulo-contable.component';
import { OpcionesMenuContableComponent } from './components/opciones-menu-contable/opciones-menu-contable.component';
import { ModuloAdministrativoRecepcionComponent } from './components/modulo-administrativo-recepcion/modulo-administrativo-recepcion.component';
import { OpcionesMenuRecepcionComponent } from './components/opciones-menu-recepcion/opciones-menu-recepcion.component';
import { ModuloClinicoLaboratorioComponent } from './components/modulo-clinico-laboratorio/modulo-clinico-laboratorio.component';
import { FormulariosLaboratorioComponent } from './components/formularios-laboratorio/formularios-laboratorio.component';
import { FormularioComponent } from './components/formulario/formulario.component';
import { Formulario3Component } from './components/formulario3/formulario3.component';
import { NavBarFormulariosComponent } from './components/nav-bar-formularios/nav-bar-formularios.component';
import { ModuloClinicoPsicologiaComponent } from './components/modulo-clinico-psicologia/modulo-clinico-psicologia.component';
import { ModuloClinicoFonoaudiologiaComponent } from './components/modulo-clinico-fonoaudiologia/modulo-clinico-fonoaudiologia.component';
import { ModuloClinicoMedicinaComponent } from './components/modulo-clinico-medicina/modulo-clinico-medicina.component';
import { ModuloClinicoOptometriaComponent } from './components/modulo-clinico-optometria/modulo-clinico-optometria.component';
import { ModuloClinicoCertificacionComponent } from './components/modulo-clinico-certificacion/modulo-clinico-certificacion.component';
import { ModuloRutasComponent } from './components/modulo-rutas/modulo-rutas.component';
import { OpcionesRutasComponent } from './components/opciones-rutas/opciones-rutas.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    ModuloClinicoComponent,
    OpcionesMenuComponent,
    ModuloLoginComponent,
    FormularioLoginComponent,
    ModuloAdministrativoPacientesComponent,
    OpcionesAdministrativoPacientesComponent,
    ModuloContableComponent,
    OpcionesMenuContableComponent,
    ModuloAdministrativoRecepcionComponent,
    OpcionesMenuRecepcionComponent,
    ModuloClinicoLaboratorioComponent,
    FormulariosLaboratorioComponent,
    FormularioComponent,
    Formulario3Component,
    NavBarFormulariosComponent,
    ModuloClinicoPsicologiaComponent,
    ModuloClinicoFonoaudiologiaComponent,
    ModuloClinicoMedicinaComponent,
    ModuloClinicoOptometriaComponent,
    ModuloClinicoCertificacionComponent,
    ModuloRutasComponent,
    OpcionesRutasComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
