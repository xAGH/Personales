import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DigitosService {

  constructor() { }

  //Metodo que imprime los digitos 
  imprimirDigitos(){
    for (let i = 0; i < 10; i++){
      console.log(i);
    }
  }
}
