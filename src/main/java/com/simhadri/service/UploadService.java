package com.simhadri.service;

import java.util.List;

import com.simhadri.entity.Employee;

public interface UploadService {
	
	void uploadCSV(List<Employee> employees);

}
