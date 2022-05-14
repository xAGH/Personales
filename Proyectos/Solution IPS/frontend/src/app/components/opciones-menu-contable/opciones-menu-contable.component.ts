import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-opciones-menu-contable',
  templateUrl: './opciones-menu-contable.component.html',
  styleUrls: ['./opciones-menu-contable.component.css']
})
export class OpcionesMenuContableComponent implements OnInit {

  @Input() opciones: any[];

  constructor() { }

  ngOnInit(): void {
  }

}
