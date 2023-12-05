import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PolicyServicesService 
{
  constructor(private http:HttpClient) { }
  baseURL:string = 'http://localhost:8585/api/v1/';

  
  getAllPolicies()
  {
    return this.http.get(this.baseURL+"policies/getall",{responseType:'json'});

  }
  
  
  registerPolicy(policy:any)
{
  let tokenString = "Bearer "+localStorage.getItem("token");
  const headers =  new HttpHeaders().set("Authorization",tokenString);
  return this.http.post(this.baseURL+"policies/add",policy,{headers,responseType: 'text' as 'json'});
}
}
