package com.simhadri.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simhadri.dao.EmployeeRepository;
import com.simhadri.entity.Employee;
import com.simhadri.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(long empId) {
		return employeeRepository.findById(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {		
		return employeeRepository.save(employee);
	}

}
