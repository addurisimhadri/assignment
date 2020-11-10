package com.simhadri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.simhadri.entity.Employee;

public class UploadUtility {
	
	
	public static List<Employee> upload(String fileName) throws IOException {
		List<Employee> employees=new ArrayList<Employee>();
		Employee employee=null;
		BufferedReader br=new BufferedReader(new FileReader(fileName));
		
		while (br.readLine()!=null && br.read()!=-1) {
			String line=br.readLine();
			String[] strArr=line.split(",");
			for (int i = 0; i < strArr.length; i++) {
				employee=new Employee();
				employee.setEmpId(Integer.parseInt(strArr[0]));
				employee.seteName(strArr[1]);
				employee.setHireDate(strArr[2]);
				employee.setSal(Double.parseDouble(strArr[3]));
				employee.setDeptId(Integer.parseInt(strArr[4]));
				employees.add(employee);
			}
		}
	
		return null;
	}

}
