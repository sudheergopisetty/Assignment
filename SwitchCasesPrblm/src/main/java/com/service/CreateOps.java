package com.service;

import com.model.Employee;

public class CreateOps {
	public static Employee[] addEmployee(Employee[] emps, Employee emp) {
		int count = emps.length;
		Employee[] employees = new Employee[count+1];
		for (int i = 0; i < count; i++) {
			employees[i] = emps[i];
		}
		employees[count] = emp;
		return employees;
	}
}
