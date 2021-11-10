import { NONE_TYPE } from '@angular/compiler';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: [
    './app.component.css',
  ]
})
export class AppComponent{ 

  resultado: number = 0;
  valor1: any;
  valor2: any;
  classOperacion = 'btn';
  classDivision = 'btn';

  estadoDivision(): boolean {
    let exp1 = String(this.valor1) == "undefined" || String(this.valor2) == "undefined" || this.valor2 == 0
    let exp2 = String(this.valor1) == "null" || String(this.valor2) == "null" || this.valor2 == 0;
    if (exp1 || exp2) {
      this.classDivision = 'btn';
      return true;
    }
    this.classDivision = 'btn btnHover';
    return false;
  }

  estadoOperacion(): boolean {
    let exp1 = String(this.valor1) == "undefined" || String(this.valor2) == "undefined";
    let exp2 = String(this.valor1) == "null" || String(this.valor2) == "null";
    if (exp1 || exp2) {
      this.classOperacion = 'btn';
      return true;
    }
    this.classOperacion = 'btn btnHover';
    return false;
  }

  sumar() : void {
    this.resultado = this.valor1 + this.valor2;
  }

  restar() : void {
    this.resultado = this.valor1 - this.valor2;
  }

  multiplicar() : void {
    this.resultado = this.valor1 * this.valor2;
  }

  dividir() : void {
    this.resultado = this.valor1 / this.valor2;
  }
}
