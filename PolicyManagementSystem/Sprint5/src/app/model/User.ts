import { Address } from './Address';

export interface User
{
    fname:string;
    lname:string;
    password:string;
    email:string;
    mobNo:string;
    userType:any;
    employerType:any;
    employerName:any;
    userCategory:any;
    dob:any;
    panNumber:string;
    address:Address;

}