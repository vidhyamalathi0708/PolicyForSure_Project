import { Component, OnInit } from '@angular/core';
import { PolicyServicesService } from 'src/app/services/policy-services.service';

@Component({
  selector: 'app-policy-search',
  templateUrl: './policy-search.component.html',
  styleUrls: ['./policy-search.component.css']
})
export class PolicySearchComponent implements OnInit
{
  policyDetails:any;
  constructor(private policyService:PolicyServicesService){}
  ngOnInit(): void 
  {
    this.policyService.getAllPolicies().subscribe
    (
      (response)=>
      {
        console.log(response);
        this.policyDetails=response;
      },
      (error)=>
      {
        console.log(error);
      }
    )

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

}
