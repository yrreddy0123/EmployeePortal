package com.socgen.employee.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
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
@TestMethodOrder(OrderAnnotation.class)
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	@Order(1)
	public void createEmployee() {

		Employee newEmploee = new Employee();

		newEmploee.setFirstName("RAM");
		newEmploee.setLastName("REDDY");

		assertNull(newEmploee.getId());

		Employee registeredEmployee = employeeService.createEmployee(newEmploee);

		assertNotNull(registeredEmployee);
		// check if object is persisted by checking id
		assertNotNull(registeredEmployee.getId());
		assertEquals(newEmploee.getFirstName(), registeredEmployee.getFirstName());
	}

	@Test
	@Order(2)
	public void getAllEmployees() {

		List<Employee> allEmployees = employeeService.getAllEmployees();

		assertNotNull(allEmployees);

		assertEquals(allEmployees.size(), 1);
	}

}
