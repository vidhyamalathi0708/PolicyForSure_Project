import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }
  baseURL:string = 'http://localhost:8585/api/v1/';

  registerUser(requestBody:any)
    {
      return this.http.post(this.baseURL+"users/add",requestBody,{responseType:'json'})
    }
}
