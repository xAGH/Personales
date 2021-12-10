import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico-psicologia',
  templateUrl: './modulo-clinico-psicologia.component.html',
  styleUrls: ['./modulo-clinico-psicologia.component.css']
})
export class ModuloClinicoPsicologiaComponent implements OnInit {

  titulo: string;
  
  constructor() {
    this.titulo = 'Módulo Clinico Psicologia';
  }
  
  ngOnInit(): void {
  }

}
