import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-opciones-administrativo-pacientes',
  templateUrl: './opciones-administrativo-pacientes.component.html',
  styleUrls: ['./opciones-administrativo-pacientes.component.css']
})
export class OpcionesAdministrativoPacientesComponent implements OnInit {

  @Input() opciones: any[];

  constructor() { }

  ngOnInit(): void {
  }
}