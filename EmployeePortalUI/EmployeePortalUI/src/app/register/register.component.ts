import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';
import { Employee } from '../Employee';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  public employee:Employee = new Employee();
  constructor(private employeeService: EmployeeServiceService) { }
  
  public register(){

    console.log("Registering Employee");
   console.log(this.employee);
    this.employeeService.registerUser(  this.employee ).subscribe(employee=>{
      window.alert("User Registered");
      this.employee=new Employee();
    });

  }


}
