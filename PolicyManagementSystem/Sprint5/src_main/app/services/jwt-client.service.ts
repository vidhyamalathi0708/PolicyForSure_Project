import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtClientService {

  constructor(private http:HttpClient) { }


    baseURL:string = 'http://localhost:8585/api/v1/';

    getGeneratedToken(requestBody: any)
    {
      return this.http.post(this.baseURL+"login/user",requestBody,{responseType:'json'});

    }

    loginUser(response:any)
    {
      localStorage.setItem("token",response.token);
      localStorage.setItem("userType",response.userType);
      localStorage.setItem("userId",response.userId);
      return true;
    }

    logout()
    {
      localStorage.removeItem('token');
      localStorage.removeItem("userType");
      localStorage.removeItem("userId");
      return true;
    }

    isUserLoggedIn()
    {
      let token=localStorage.getItem('token');
      if(token==undefined || token==='' || token==null)
      {
        return false;
      }
      else if(localStorage.getItem('userType')==='User')
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    isAdminLoggedIn()
    {
      let token=localStorage.getItem('token');
      if(token==undefined || token==='' || token==null)
      {
        return false;
      }
      else if(localStorage.getItem('userType')==='Admin')
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    getToken()
    {
      return localStorage.getItem('token');
    }



















    

    authorizationTest(token:any)
    {
      let tokenString = "Bearer "+token;
      const headers =  new HttpHeaders().set("Authorization",tokenString);
      return this.http.get(this.baseURL+"policies/getall",{headers,responseType:'text' as 'json'});
    }

    registerUser(requestBody:any)
    {
      return this.http.post(this.baseURL+"users/add",requestBody,{responseType: 'text' as 'json'})
    }
}
