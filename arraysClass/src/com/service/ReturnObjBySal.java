package com.service;

import com.model.Employee;

public class ReturnObjBySal {
	public Employee[] ReturnObjBySalary(Employee[] employees, long salaryToCheck) {
		
		int count=0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpSalary() == salaryToCheck) {
				count++;				
			}
		}
		
		Employee[] employees1= new Employee[count];
		
		int count1=0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpSalary() == salaryToCheck) {
				employees1[count1]= employees[i];
				count1++;
			}
		}
		return employees1;
	}
}
