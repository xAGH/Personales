import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-administrativo-pacientes',
  templateUrl: './modulo-administrativo-pacientes.component.html',
  styleUrls: ['./modulo-administrativo-pacientes.component.css']
})
export class ModuloAdministrativoPacientesComponent implements OnInit {

  titulo: string;

  opciones: any = [
    {ruta:"https://i.imgur.com/54T21mn.jpeg", nombre:"Citas"},
    {ruta:"https://i.imgur.com/3mmdq4F.jpeg", nombre:"Pagos"},
    {ruta:"https://i.imgur.com/WUc32cB.jpeg", nombre:"Cancelaciones"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Remisiones"},
    {ruta:"https://i.imgur.com/k1vxdH2.jpeg", nombre:"Certificaciónes"},
  ]
  
  constructor() {
    this.titulo = 'Módulo Administrativo Pacientes';
  }

  ngOnInit(): void {
  }

}
