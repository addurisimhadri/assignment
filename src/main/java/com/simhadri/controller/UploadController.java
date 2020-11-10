package com.simhadri.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartRequest;

import com.simhadri.UploadUtility;
import com.simhadri.entity.Employee;
import com.simhadri.service.UploadService;

@RestController
@RequestMapping(value = "/upload")
public class UploadController {

	@Autowired
	private UploadService uploadService ;
	
	@PostMapping(value = "/fileupload")
	public void upload(MultipartRequest request) throws IOException {
		
	Iterator<String>  files= request.getFileNames();
	HashSet<String> hset=new HashSet<String>();
	while (files.hasNext()) {
		String fileName = (String) files.next();
		boolean flag=hset.add(fileName);
		if(!flag) {
			List<Employee> employees=UploadUtility.upload(fileName);			
			uploadService.uploadCSV(employees);
		}
		
	}
	
		
	}
}
