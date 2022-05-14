import { Injectable } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  constructor( private http: HttpClient ) {}

  post(url: string, data: any){
    return this.http.post(url, data)  
  }

  get(url: string){
    return this.http.get(url)
  }
  
}
