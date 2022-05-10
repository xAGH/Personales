import { Component, OnInit } from '@angular/core';
//importacion de servicios
import {DigitosService} from '../digitos.service';
import {DigitosObservableService} from '../digitos-observable.service';
import {ClientService} from '../client.service';
//importacion de clases necesarias para manejar formularios reactivos y el routing
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ejemplos',
  templateUrl: './ejemplos.component.html',
  styleUrls: ['./ejemplos.component.css']
})
export class EjemplosComponent implements OnInit {
  //(6) grupo de controles de nuestro formulario
  form: FormGroup;
  //(2) propiedad que guarda la referencia a la suscripcion al observable
  obs;
  //(3) propiedad que guarda el json que viene del server con los productos disponibles
  //y es usada para mostrar los productos en la vista
  productos; 
  //(4) propiedad que guarda el json que viene del server con el producto seleccionado mediante un id
  //y es usada para mostrar el producto en la vista
  productoPorId;
  //(5) propiedad que guarda el json que viene del server con la notificación de que el producto ha sido creado exitosamente
  //y es usada para mostrar la notificación de creación del producto en la vista
  //su valor inicial es "Producto aún no creado"
  estadoCrearProducto: string = "Producto aún no creado";


  //inyeccion de dependencias
  constructor(
    public digitos: DigitosService, 
    public digitosObservable: DigitosObservableService,
    public client: ClientService,
    private fb: FormBuilder,
    private route: Router
    ) {
  }


  //---------------------------------------------------------------------
  //(1) llamada al metodo imprimirDigitos del servicio DigitosService 
  mostrarDigitos(){
      this.digitos.imprimirDigitos();
  }
  //---------------------------------------------------------------------


  //---------------------------------------------------------------------
  //(2) llamada al metodo imprimirDigitos del servicio DigitosObservableService 
  mostrarDatosObservable(){
    //se llama al servicio y nos suscribimos al observable que nos devuelve
    //guardamos la referencia como this.obs para poder cancelar la suscripcion luego
    this.obs = this.digitosObservable.imprimirDigitos().subscribe(
          //capturamos el valor emitido por next() y lo imprimimos por consola
          (digito) => console.log(digito, "dato emitido por el observable"),
          //capturamos el valor emitido por error() y lo imprimimos por consola
          error => console.log(error),
          //recibimos la notificacion de que el observable ha completado su trabajo
          //tal notificacion o señal es emitida por complete() No nos pasa ningun argumento
          () => console.log("Digitos completos. El observable ha terminado")
    )
  }
  

  //llamada al metodo unsubscribe mediante la referencia this.obs para 
  //cancelar la suscripcion al observable
  desuscribirse(){
    this.obs.unsubscribe();
  }
  //---------------------------------------------------------------------


  //---------------------------------------------------------------------
  //(3) llamada al metodo  getRequestAllProducts del servicio ClientService
  //el cual nos permite enviar informacion a un servidor web
  pedirProductos(){
    //se hace la llamada http y la respuesta del cliente de Angular será un observable
    //por lo tanto debemos suscribirnos a el para obtener el valor de retorno, ya sea
    //la descarga esperada o un error
    this.client.getRequestAllProducts('http://localhost:5000/allproducts').subscribe(
      //capturamos el valor de descarga emitido por next() del observable y extraemos del json
      //el valor de la porpiedad "datos" con el cual definimos la porpiedad productos que estamos
      //interpolando en el HTML
      (data): any =>  this.productos = data["datos"],
      error => console.log("Ha ocurrido un error en la llamada: ", error)
    )
  }
  //---------------------------------------------------------------------


  //---------------------------------------------------------------------
  //(4) llamada al metodo  getRequestIdProduct del servicio ClientService
  pedirProductosPorId(){
    this.client.getRequestIdProduct('http://localhost:5000/product', 1).subscribe(
      data => this.productoPorId = data["productoInfo"],
      error => console.log("Ha ocurrido un error en la llamada")
    )
  }
  //---------------------------------------------------------------------


  //---------------------------------------------------------------------
  //(5) llamada al metodo  postRequestCreateProduct del servicio ClientService
  //aca al ser una llamada por metodo post pasamos datos en el body en este caso pasamos {nombre: "Pimienta", precio: 2600}
  crearProducto(){
    this.client.postRequestCreateProduct('http://localhost:5000/create', {nombre: "Pimienta", precio: 2600}).subscribe(
      data => this.estadoCrearProducto = data["status"],
      error => console.log("Ha ocurrido un error en la llamada")
    )
  }
  //---------------------------------------------------------------------


  //---------------------------------------------------------------------
  //en ngOnInit() metemos todas las instrucciones que queremos que se ejecuten apenas se cree nuestro componente
  ngOnInit(): void {
    //(2)llamamaos al inicio al metodo mostrarDatosObservable
    this.mostrarDatosObservable();
    //(6) creamos nuestro formulario  tan pronto cargue nuestro componente a partir de los controles que en el HTML llamamos "email" y "password"
    //estos controles se encuentran en cada input del formulario formControlName="email" y formControlName="password" 
    //se configuran los valores iniciales de cada input y las validaciones correspondientes
    this.form = this.fb.group({
      email: ['', Validators.email],
      password: ['', Validators.required]
    });
  }
  //---------------------------------------------------------------------


  //---------------------------------------------------------------------
  //(6) metodo que se llama para enviar el formulario cuando ocurre el evento (ngSubmit) 
  //que se encuentra referenciado en el form del HTML
  onSubmit() {
    //si la validacion del formulario es exitosa...
    if (this.form.valid) {
      //se envian los datos del formulario mediante una solicitud POST, los valores de los inputs del formulario 
      //se recogen usando los controles "email" y "password" para formar el json a enviar..
      this.client.postRequestSendForm('http://localhost:5000/formulario', {
        email: this.form.value.email,
        password: this.form.value.password
      }).subscribe(
        //cuando la respuesta del server llega es emitida por el observable mediante next()..
        (response: any) => {
          //se imprime la respuesta del server
          console.log(response);
          //se guarda el valor de la propiedad email en el almacenamiento local persistente
          localStorage.setItem('email', response.email)
          //se guarda el valor de la propiedad password en el almacenamiento local por sesión
          //estos datos se borran tan pronto el usuario cierra la ventana
          sessionStorage.setItem('pass', response.password)
          //recuperamos el valor de la porpiedad email guardada anteriormete y la imprimimos
          console.log(localStorage.getItem('email'));
          //dirigimos al usuario a la ruta /ayuda
          this.route.navigate( ['/ayuda']);
      },
      //si ocurre un error en el proceso de envío del formulario...
      (error) => {
        //se imprime el status del error
        console.log(error.status);
      })
    //si ocurrio un error en la validacion del formulario este no se enviara
    //y se imprimira el mensaje "Form error"
    } else {
      console.log("Form error");
    }
  }

  mostrarMensaje(){

  }
}
