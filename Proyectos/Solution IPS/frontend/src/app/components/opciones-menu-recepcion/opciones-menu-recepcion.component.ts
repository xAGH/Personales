import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-opciones-menu-recepcion',
  templateUrl: './opciones-menu-recepcion.component.html',
  styleUrls: ['./opciones-menu-recepcion.component.css']
})
export class OpcionesMenuRecepcionComponent implements OnInit {

  @Input() opciones: any[];

  constructor() { }

  ngOnInit(): void {
  }

}
