package com.simhadri.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainDemo {
	
	public static List<Employee> employees= new CopyOnWriteArrayList<Employee>();
	static {
			Employee e=new Employee();
			e.setName("Sridhar");
			e.setAge(21);
			e.setLocation("Hyderabad");
			employees.add(e);
			 e=new Employee();
			 e.setName("Phani");
			 e.setAge(24);
			 e.setLocation("Delhi");
			 employees.add(e);
			 e=new Employee();
			 e.setName("Somu");
			 e.setAge(36);
			 e.setLocation("Pune");
			 employees.add(e);
			 e=new Employee();
			 e.setName("Sridhar");
			 e.setAge(21);
			 e.setLocation("Chennai");
			 employees.add(e);
			 e=new Employee();
			 e.setName("Mahesh");
			 e.setAge(45);
			 e.setLocation("Mumbai");
			 employees.add(e);
			 
			 
			 
	}

	public static void main(String[] args) {
		
		System.out.println(employees);
		removeDuplicate(employees);
		System.out.println(employees);
	}
	
	public static void removeDuplicate(List<Employee> employees) {
		HashSet<String> hset=new HashSet<String>();
		try {
			Iterator<Employee> it=employees.iterator();
			while (it.hasNext()) {
				Employee employee =  it.next();
				boolean flag=hset.add(employee.getName()+employee.getAge());
				if(!flag) {
					employees.remove(employee);
				}
			}			
			
		} catch (Exception e) {
		
			System.err.println("Ex:: "+e.toString());
		}
		
	}

}
