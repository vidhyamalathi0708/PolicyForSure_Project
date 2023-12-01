import { Component } from '@angular/core';
import { JwtClientService } from 'src/app/jwt-client.service';
import { AuthRequest } from 'src/app/model/AuthRequest';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  response:any;
    token:any;

    authRequest: AuthRequest = new AuthRequest();
    constructor(private jwtService:JwtClientService){}


  ngOnInit(): void {}


   readFormData(formData:any)
   {
      this.authRequest.username = formData.form.value.username;
      this.authRequest.password = formData.form.value.password;
      this.getAccessToken(this.authRequest);
   }

  public getAccessToken(authRequest:any)
  {
    let response =  this.jwtService.getGeneratedToken(authRequest);
    response.subscribe( (genToken)=> {  this.token = genToken ;console.log(genToken);  this.accessApi(this.token) });
  }

  public accessApi(token:any)
  {
    let response = this.jwtService.authorizationTest(token);
    response.subscribe( responseData => {this.response = responseData; console.log(responseData) });
  }


}
