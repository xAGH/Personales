import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-contable',
  templateUrl: './modulo-contable.component.html',
  styleUrls: ['./modulo-contable.component.css']
})
export class ModuloContableComponent implements OnInit {

  titulo: string;

  opciones: any = [
    {ruta:"https://i.imgur.com/54T21mn.jpeg", nombre:"Facturacion"},
    {ruta:"https://i.imgur.com/3mmdq4F.jpeg", nombre:"Anulacion"},
    {ruta:"https://i.imgur.com/WUc32cB.jpeg", nombre:"Consultas"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Recibos"},
  ]

  constructor() {
    this.titulo = 'Módulo Contable';
  }

  ngOnInit(): void {
  }

}