import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico-laboratorio',
  templateUrl: './modulo-clinico-laboratorio.component.html',
  styleUrls: ['./modulo-clinico-laboratorio.component.css']
})
export class ModuloClinicoLaboratorioComponent implements OnInit {

  titulo: string;

  constructor() {
    this.titulo = 'Módulo Clínico Laboratorio';
  }

  ngOnInit(): void {
  }

}

