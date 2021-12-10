import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-opciones-menu',
  templateUrl: './opciones-menu.component.html',
  styleUrls: ['./opciones-menu.component.css']
})
export class OpcionesMenuComponent implements OnInit {

  @Input() opciones: any[];

  constructor() { }

  ngOnInit(): void {
  }

}
