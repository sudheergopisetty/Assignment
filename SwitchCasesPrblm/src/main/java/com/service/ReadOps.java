package com.service;

import com.model.Employee;

public class ReadOps {
	public static void readAllEmployees(Employee[] emps) {
		for (Employee emp : emps) {
			System.out.println(
					"Name : " + emp.getEmpName() + "  Id : " + emp.getEmpId() + "   Salary  : " + emp.getSalary());
		}
	}
}
