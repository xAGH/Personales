import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private http: HttpClient
  ) {}

  get(url: string){
    return this.http.get(url).pipe(
      map(
        (response: any) => response.data
      )
    );
  }
}
