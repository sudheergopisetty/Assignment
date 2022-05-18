package com.service;

import com.model.EmployeeObj;

public class EligibleToWork {
	public String checkEligibleToWork(EmployeeObj emp) {
		if (emp.getEmpAge() >= 18 && emp.getEmpAge() <= 58) {
			return ("Age is between 18 and 58 :" + emp.getEmpAge());
		} else {
			return ("Age is not between 18 and 58 :" + emp.getEmpAge());
		}
	}
}
