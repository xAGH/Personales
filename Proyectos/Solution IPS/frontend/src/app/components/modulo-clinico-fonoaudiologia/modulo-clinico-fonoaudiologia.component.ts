import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico-fonoaudiologia',
  templateUrl: './modulo-clinico-fonoaudiologia.component.html',
  styleUrls: ['./modulo-clinico-fonoaudiologia.component.css']
})
export class ModuloClinicoFonoaudiologiaComponent implements OnInit {

  titulo: string;
  
  constructor() {
    this.titulo = 'Módulo Clinico Fonoaudiologia';
  }

  ngOnInit(): void {
  }

}
