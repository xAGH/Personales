import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ModuloLoginComponent } from './components/modulo-login/modulo-login.component';
import { ModuloContableComponent } from './components/modulo-contable/modulo-contable.component';
import { ModuloClinicoPsicologiaComponent } from './components/modulo-clinico-psicologia/modulo-clinico-psicologia.component';
import { ModuloClinicoOptometriaComponent } from './components/modulo-clinico-optometria/modulo-clinico-optometria.component';
import { ModuloClinicoMedicinaComponent } from './components/modulo-clinico-medicina/modulo-clinico-medicina.component';
import { ModuloClinicoLaboratorioComponent } from './components/modulo-clinico-laboratorio/modulo-clinico-laboratorio.component';
import { ModuloClinicoFonoaudiologiaComponent } from './components/modulo-clinico-fonoaudiologia/modulo-clinico-fonoaudiologia.component';
import { ModuloClinicoCertificacionComponent } from './components/modulo-clinico-certificacion/modulo-clinico-certificacion.component';
import { ModuloClinicoComponent } from './components/modulo-clinico/modulo-clinico.component';
import { ModuloAdministrativoRecepcionComponent } from './components/modulo-administrativo-recepcion/modulo-administrativo-recepcion.component';
import { ModuloAdministrativoPacientesComponent } from './components/modulo-administrativo-pacientes/modulo-administrativo-pacientes.component';
import { ModuloRutasComponent } from './components/modulo-rutas/modulo-rutas.component';

const routes: Routes = [
  {path: '', component: ModuloRutasComponent},
  {path: 'clinico', component: ModuloClinicoComponent},
  {path: 'login', component: ModuloLoginComponent},
  {path: 'contable', component: ModuloContableComponent},
  {path: 'psicologia', component: ModuloClinicoPsicologiaComponent},
  {path: 'optometria', component: ModuloClinicoOptometriaComponent},
  {path: 'medicina', component: ModuloClinicoMedicinaComponent},
  {path: 'laboratorio', component: ModuloClinicoLaboratorioComponent},
  {path: 'fonoaudiologia', component: ModuloClinicoFonoaudiologiaComponent},
  {path: 'certificacion', component: ModuloClinicoCertificacionComponent},
  {path: 'admirecepcion', component: ModuloAdministrativoRecepcionComponent},
  {path: 'admipacientes', component: ModuloAdministrativoPacientesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
