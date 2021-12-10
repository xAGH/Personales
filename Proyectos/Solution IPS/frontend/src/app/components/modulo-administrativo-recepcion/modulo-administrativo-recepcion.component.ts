import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-administrativo-recepcion',
  templateUrl: './modulo-administrativo-recepcion.component.html',
  styleUrls: ['./modulo-administrativo-recepcion.component.css']
})
export class ModuloAdministrativoRecepcionComponent implements OnInit {

  titulo: string;

  opciones: any = [
    {ruta:"https://i.imgur.com/54T21mn.jpeg", nombre:"Consultas"},
    {ruta:"https://i.imgur.com/3mmdq4F.jpeg", nombre:"Citas"},
    {ruta:"https://i.imgur.com/WUc32cB.jpeg", nombre:"Facturacion"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Registro Paciente"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Certificaciones"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Cancelaciones"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Remisiones"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Registro Personal"},
  ]

  constructor() {
    this.titulo = 'Módulo Administrativo Recepcion';
  }

  ngOnInit(): void {
  }

}