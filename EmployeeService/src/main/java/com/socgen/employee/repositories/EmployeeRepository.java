package com.socgen.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.socgen.employee.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
