import { Component, OnInit } from '@angular/core';
import { ClientService } from './services/client.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  form: FormGroup = new FormGroup({});

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      email: ['', Validators.email],
      password: ['', Validators.required]
    });
  }

  constructor(
    private clientService: ClientService,
    private formBuilder: FormBuilder
    ) {
  }

  testClient(){
    let url= "http://localhost:5000/allproducts"

    this.clientService.get(url).subscribe({
      next: (res) => console.log(res),
      error: (e) => console.error(e)
    })
  }

  onSubmit(){
    let data = {
      email: this.form.value.email,
      password: this.form.value.password
    }
    let url = "http://localhost:5000/formulario"
    this.clientService.post(url, data).subscribe({
      next: (res) => console.log(res),
      error: (e) => console.error(e)
    })
  }
}
