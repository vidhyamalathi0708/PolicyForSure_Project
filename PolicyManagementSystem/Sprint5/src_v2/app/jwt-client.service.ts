import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {

  constructor(private http:HttpClient) { }


    baseURL:string = 'http://localhost:8585/api/v1/';

    getGeneratedToken(requestBody: any){

        return this.http.post(this.baseURL+"login/user",requestBody,{responseType: 'text' as 'json'});

    }

    registerUser(requestBody:any)
    {
      return this.http.post(this.baseURL+"users/add",requestBody,{responseType: 'text' as 'json'})
    }

    authorizationTest(token:any){

          let tokenString = "Bearer "+token;

         const headers =  new HttpHeaders().set("Authorization",tokenString);


        return this.http.get(this.baseURL+"policies/getall",{headers,responseType:'text' as 'json'});

    }


}
