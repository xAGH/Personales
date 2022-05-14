import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formularios-laboratorio',
  templateUrl: './formularios-laboratorio.component.html',
  styleUrls: ['./formularios-laboratorio.component.css']
})
export class FormulariosLaboratorioComponent implements OnInit {

  formulario1: any = [
    {name : "nombre", text: "Nombre", type: "text"},
    {name: "apellido", text: "Apellido", type: "text"},
    {name: "fecNac", text:"Fecha de nacimiento", type: "date"},
    {name: "edad", text: "Edad", type: "number"},
    {name: "nacionalidad", text: "Nacionalidad", type: "text"},
    {name: "lugNac", text: "Lugar de nacimiento ", type: "text"},
    {name: "genero", text: "Genero", type: "select", options:[
      {value: "-", text: "Seleccione"},
      {value: "M", text: "Masculino"},
      {value: "F", text: "Femenino"},
      {value: "O", text: "Otro"}
    ]},
    {name: "direccion", text: "Dirección", type: "text"},
    {name: "telIdentidicacion", text: "Teléfono", type: "text"}
  ]
  formulario2: any = [
    {name : "empresa", text: "Empresa", type: "text"},
    {name: "cargo", text: "Cargo", type: "text"},
    {name: "fecIngreso", text:"Fecha de inicio", type: "date"},
    {name: "tiempoCargo", text: "Tiempo en cargo(meses)", type: "number"},
    {name: "arl", text: "ARL", type: "select", options: [
      {value: "-", text: "Seleccione"},
      {value: "SURA", text: "SURA"},
      {value: "ARL", text: "ARL"},
    ]},
    {name: "eps", text: "EPS", type: "select", options:[
      {value: "-", text: "Seleccione"},
      {value: "medimas", text: "Medimás"},
      {value: "nueva_eps", text: "Nueva Eps"},
      {value: "sura", text: "SURA"}
    ]},
    {name: "afp", text: "AFP", type: "select", options: [
      {value: "-", text: "Seleccione"},
      {value: "porvenir", text: "Porvenir"},
      {value: "proteccion", text: "Protección"},
    ]},
    {name: "correo", text: "Correo", type: "email"},
    {name : "telOcupacional", text: "Teléfono ocupacional", type: "text"},
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
