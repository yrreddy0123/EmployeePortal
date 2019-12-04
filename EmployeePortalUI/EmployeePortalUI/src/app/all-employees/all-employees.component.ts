import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService } from '../employee-service.service';
import { Employee } from '../Employee';

@Component({
  selector: 'app-all-employees',
  templateUrl: './all-employees.component.html',
  styleUrls: ['./all-employees.component.css']
})
export class AllEmployeesComponent implements OnInit {

  employeeList:Employee[] =[];
  constructor(private employeeService: EmployeeServiceService) { }
	ngOnInit() {
		this.employeeService.getAllEmployees().subscribe((employeeList: Employee[])=>{  
      console.log("Response from Server"); 
      console.log(employeeList); 
			this.employeeList = employeeList;  
		})  
  }
  

}
