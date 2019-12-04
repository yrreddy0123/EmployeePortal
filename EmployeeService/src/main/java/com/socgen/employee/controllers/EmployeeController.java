package com.socgen.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.employee.entities.Employee;
import com.socgen.employee.services.EmployeeService;

/**
 * 
 * Main Controller for Employee Portal End Point
 * 
 * @author RAM
 *
 */
@RestController
@RequestMapping("/api/employee")
@CrossOrigin
public class EmployeeController {


	private EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("/register")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee newEmployee) {

		newEmployee = employeeService.createEmployee(newEmployee);
		
		return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployees();
	}
}
