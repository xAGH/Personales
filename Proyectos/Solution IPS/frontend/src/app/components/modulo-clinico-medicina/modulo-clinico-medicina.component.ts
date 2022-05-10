import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico-medicina',
  templateUrl: './modulo-clinico-medicina.component.html',
  styleUrls: ['./modulo-clinico-medicina.component.css']
})
export class ModuloClinicoMedicinaComponent implements OnInit {

  titulo: string;
  
  constructor() {
    this.titulo = 'Módulo Clinico Medicina';
  }

  ngOnInit(): void {
  }

}
