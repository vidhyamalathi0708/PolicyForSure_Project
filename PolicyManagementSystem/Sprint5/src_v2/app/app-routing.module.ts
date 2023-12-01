import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './components/homepage/homepage.component';
import { LoginComponent } from './components/login/login.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { RegisterComponent } from './components/register/register.component';
import { PolicyRegComponent } from './components/policy-reg/policy-reg.component';

const routes: Routes = [

  {
    path:'',
    component:HomepageComponent,
    pathMatch:'full'
  },
  {
    path:'login',
    component:LoginComponent,
    pathMatch:'full'
  },
  {
    path:'dashboard',
    component:DashboardComponent,
    pathMatch:'full'
  },
  {
    path:'register-user',
    component:RegisterComponent,
    pathMatch:'full'
  },
  {
    path:'register-policy',
    component:PolicyRegComponent,
    pathMatch:'full'
  }




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
