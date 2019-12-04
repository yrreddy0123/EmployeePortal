package com.socgen.employee.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.socgen.employee.entities.Employee;

/**
 * Service Interface for all Employee Operations
 * 
 * @author RAM
 *
 */
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void createEmployee() {

		Employee newEmploye = employeeService.createEmployee(new Employee());

		assertEquals(newEmploye, null);
	}

	@Test
	public void getAllEmployees() {

		List<Employee> newEmploye = employeeService.getAllEmployees();

		assertEquals(newEmploye, null);
	}
}
