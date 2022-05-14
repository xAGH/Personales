import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico',
  templateUrl: './modulo-clinico.component.html',
  styleUrls: ['./modulo-clinico.component.css']
})
export class ModuloClinicoComponent implements OnInit {

  titulo: string;

  opciones: any = [
    {ruta:"https://i.imgur.com/54T21mn.jpeg", nombre:"Medicina", link:"/medicina"},
    {ruta:"https://i.imgur.com/3mmdq4F.jpeg", nombre:"Laboratorio", link:"/laboratorio" },
    {ruta:"https://i.imgur.com/WUc32cB.jpeg", nombre:"Psicología", link:"/psicologia"},
    {ruta:"https://i.imgur.com/T30LLEB.jpeg", nombre:"Optometría", link:"/optometria"},
    {ruta:"https://i.imgur.com/cFJgPCV.jpeg", nombre:"Fonoaudiología", link:"/fonoaudiologia"},
    {ruta:"https://i.imgur.com/k1vxdH2.jpeg", nombre:"Certificación", link:"/certificacion"},
  ]

  constructor() {
    this.titulo = 'Módulo Clínico';
  }

  ngOnInit(): void {
  }

}
