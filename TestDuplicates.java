package com.map;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class TestDuplicates {
	
public static void main(String[] args) {
		
	EmployeeInfo employee1 = new EmployeeInfo(10, "Akshay");
	EmployeeInfo employee2 = new EmployeeInfo(20, "Murali");
	EmployeeInfo employee3 = new EmployeeInfo(30, "candy");
	EmployeeInfo employee4 = new EmployeeInfo(10, "Akshay");	
	EmployeeInfo employee5 = new EmployeeInfo(20, "Pihu");	
	EmployeeInfo employee6 = new EmployeeInfo(40, "Murali");	
		
		Set <EmployeeInfo> employee = new HashSet<EmployeeInfo>();
		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		employee.add(employee5);
		employee.add(employee6);
		
		Iterator <EmployeeInfo> itr = (employee.iterator());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}
	



