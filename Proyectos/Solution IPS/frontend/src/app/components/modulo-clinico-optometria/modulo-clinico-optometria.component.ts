import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico-optometria',
  templateUrl: './modulo-clinico-optometria.component.html',
  styleUrls: ['./modulo-clinico-optometria.component.css']
})
export class ModuloClinicoOptometriaComponent implements OnInit {

  titulo: string;
  
  constructor() {
    this.titulo = 'Módulo Clinico Optometria';
  }

  ngOnInit(): void {
  }

}
