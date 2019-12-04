package com.socgen.employee.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.socgen.employee.entities.Employee;
import com.socgen.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee createEmployee(Employee employee) {

		Objects.requireNonNull(employee);

		Employee newEmployee = employeeRepository.save(employee);

		return newEmployee;
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> allEmployees = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName"));

		return allEmployees;
	}

}
