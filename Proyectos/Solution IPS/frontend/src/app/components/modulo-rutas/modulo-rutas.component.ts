import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-rutas',
  templateUrl: './modulo-rutas.component.html',
  styleUrls: ['./modulo-rutas.component.css']
})
export class ModuloRutasComponent implements OnInit {
  
  titulo: string;

  opciones: any = [
    {ruta:"https://i.imgur.com/54T21mn.jpeg", nombre:"Modulo Clinico", link:"/clinico"},
    {ruta:"https://i.imgur.com/3mmdq4F.jpeg", nombre:"Administrativo Pacientes", link:"/admipacientes" },
    {ruta:"https://i.imgur.com/WUc32cB.jpeg", nombre:"Administrativo Recepcion", link:"/admirecepcion"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Login", link:"/login"},
    {ruta:"https://i.imgur.com/cFJgPCV.jpeg", nombre:"Modulo Contable", link:"/contable"},
  ]
  
  constructor() {
    this.titulo = 'Módulo de Prueba (RUTAS)';
  }

  ngOnInit(): void {
  }

}
