import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ClientService } from './services/client.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

form: FormGroup = new FormGroup({});

  ngOnInit(){
    this.form = this.fb.group({
      email: ['', Validators.email],
      password: ['', Validators.required]
    });
  }

  constructor(
    private fb: FormBuilder,
    private clientService: ClientService
    ) {
  }

  onSubmit(){
    let data = {
      email: "Alejo",
      password: "Giraldo"
    }
    this.clientService.sendFormToJson("http://localhost:5000/formulario", data).subscribe({
      next: (res) => console.log(res),
      error: (e) => console.error(e)
    })
  }
}
