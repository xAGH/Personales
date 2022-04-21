import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DigitosObservableService {

  //contador que se usa para emitir señales al observador
  public contador: number = 0;
  constructor() { }


  //metodo que devuelve un observable tipo number el cual emite como valores los numeros
  //del 0 al 9.
  imprimirDigitos():Observable <number>{
    return new Observable <number>( observer => {
      //se emite la primera señal con el valor del contador
      //en este caso 0 que es el valor inicial del contador
      observer.next(this.contador);
      setInterval(
        //cada segundo se llamara a esta funcion flecha
        () => {
        //se incrementa en 1 el contador
        this.contador++;
        //se emite una nueva señal al observador con el valor del contador actualizado
        observer.next(this.contador);
        //si el valor del contador ha llegado a 9...
        if (this.contador == 9){
          //se envia la señal al observador de que se ha finalizado la tarea
          observer.complete();
        }
      }, 1000);

      //a los 6 segundos de iniciar la suscripcion por parte del orservador se envia una señal o valor
      //de error al observador, esto detiene la ejecucion del observable.
      setTimeout(() => observer.error(new Error("Ha ocurrido un error en el observable")), 6000);
      }); 
      
    };
}
