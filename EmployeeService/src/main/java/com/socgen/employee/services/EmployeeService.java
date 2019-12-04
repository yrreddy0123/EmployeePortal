package com.socgen.employee.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.socgen.employee.entities.Employee;

/**
 * Service Interface for all Employee Operations
 * 
 * @author RAM
 *
 */
@Service
public interface EmployeeService {

	/**
	 * @param Employee
	 * @return persisted Employee Entity
	 */
	public Employee createEmployee(Employee employee);

	/**
	 * Get List of all employees with default ordering by first name
	 * 
	 * @return List of Employess
	 */
	public List<Employee> getAllEmployees();
}
