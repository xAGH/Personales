import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-modulo-clinico',
  templateUrl: './modulo-clinico.component.html',
  styleUrls: ['./modulo-clinico.component.css']
})
export class ModuloClinicoComponent implements OnInit {

  titulo: string;
  opciones: any = [
    {ruta:"cubo.png", nombre:"Medicina"},
    {ruta:"cubo.png", nombre:"Laboratorio"},
    {ruta:"cubo.png", nombre:"Psicología"},
    {ruta:"cubo.png", nombre:"Optometría"},
    {ruta:"cubo.png", nombre:"Fonoaudiología"},
    {ruta:"cubo.png", nombre:"Certificación"},
  ]

  constructor() {
    this.titulo = 'Módulo Clínico';
  }

  ngOnInit(): void {
  }

}
