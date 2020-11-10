package com.simhadri.service;

import java.util.List;
import java.util.Optional;

import com.simhadri.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();
	Optional<Employee> getEmployee(long empId);
	Employee updateEmployee(Employee employee);
	

}
