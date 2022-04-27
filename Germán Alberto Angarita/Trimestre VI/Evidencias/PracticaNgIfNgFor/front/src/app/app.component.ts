import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClientService } from './services/http-client.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'front';
  viewTable = true;

  data$?: Observable<any>;

  constructor(
    private httpClientService: HttpClientService
  ){
    this.data$ = this.httpClientService.get("http://localhost:5000/");
  }

  onClick(){
    console.log(this.data$)
  }

}
