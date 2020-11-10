package com.simhadri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simhadri.DataNotAvailble;
import com.simhadri.entity.Employee;
import com.simhadri.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService ;
	
	
	@GetMapping(value = "/getAll")
	public List<Employee> getAll(){
		return employeeService.getAll();
		
	}
	@GetMapping(value = "/get/{id}")
	public Employee get(@PathVariable("id") long empId) throws DataNotAvailble {
		
		Optional<Employee> empOP=employeeService.getEmployee(empId);
		if(!empOP.isPresent()) {
			throw new DataNotAvailble("Data Not Available");
		}
		return empOP.get();
	}
	
	@PutMapping(value = "/update/{id}")
	public Employee update(@PathVariable("id") long empId, @RequestBody Employee employee) throws DataNotAvailble {
		Employee emp;
		Optional<Employee> e=employeeService.getEmployee(empId);
		if(e.isPresent()) {
			emp=employeeService.updateEmployee(employee);
		}else {			
			throw new DataNotAvailble("Data Not Available");
		}
		
		return emp;
				
	}
	
	
		
	}
	
	

