package com.simhadri.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simhadri.dao.EmployeeRepository;
import com.simhadri.entity.Employee;
import com.simhadri.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void uploadCSV(List<Employee> employees) {
		
		Iterator<Employee> it=employees.iterator();
		while (it.hasNext()) {			
			try {
				Employee employee = (Employee) it.next();
				employeeRepository.save(employee);				
			} catch (Exception e) {
				System.err.println("Ex:: "+e.toString());
			}

		}
		
	}

}
