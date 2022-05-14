import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-opciones-rutas',
  templateUrl: './opciones-rutas.component.html',
  styleUrls: ['./opciones-rutas.component.css']
})
export class OpcionesRutasComponent implements OnInit {

  @Input() opciones: any[];

  constructor() { }

  ngOnInit(): void {
  }

}
