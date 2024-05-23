package com.mkpits.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmployee{

	public static void main(String[] args) {
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		
		emp.add(new Employee(1,"vinay"));
		emp.add(new Employee(2,"raj"));
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
		for (Iterator iterator = emp.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
	}

}
