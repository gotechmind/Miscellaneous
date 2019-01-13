import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getFields(){
    return this.http.get("http://localhost:8080/formfields");
  }

  getValuesForField(url){
    return this.http.get(url);
  }
}
