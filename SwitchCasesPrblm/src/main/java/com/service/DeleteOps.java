package com.service;

import com.model.Employee;

public class DeleteOps {
	
	public static Employee[] removeEmployee(Employee[] emps, int empId) {
		int count = emps.length;
		Employee[] employees = new Employee[count - 1];
		int j = 0;
		for (int i = 0; i < count; i++) {
			if (emps[i].getEmpId() == empId) {
				continue;
			} else {
				employees[j] = emps[i];
				j++;
			}
		}
		return employees;
	}
}
