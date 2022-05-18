package com.service;

import com.model.EmployeeObj;

public class HighestSalaryBW2Emp {
	public String highestSalary(EmployeeObj emp1, EmployeeObj emp2) {
		if (emp1.getEmpSalary() > emp2.getEmpSalary()) {
			return ("Highest salary is :"+ emp1.getEmpSalary());
		} else {
			return ("Highest salary is :"+ emp2.getEmpSalary());
		}
	}
	
	public String nameOfhighestSalary(EmployeeObj emp1, EmployeeObj emp2) {
		if (emp1.getEmpSalary() > emp2.getEmpSalary()) {
			return ("Highest salary is :"+ emp1.getEmpName());
		} else {
			return ("Highest salary is :"+ emp2.getEmpName());
		}
	}
}
