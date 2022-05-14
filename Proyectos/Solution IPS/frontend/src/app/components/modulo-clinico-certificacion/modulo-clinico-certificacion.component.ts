import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico-certificacion',
  templateUrl: './modulo-clinico-certificacion.component.html',
  styleUrls: ['./modulo-clinico-certificacion.component.css']
})
export class ModuloClinicoCertificacionComponent implements OnInit {

  titulo: string;
  
  constructor() {
    this.titulo = 'Módulo Clinico Certificacion';
  }

  ngOnInit(): void {
  }

}
