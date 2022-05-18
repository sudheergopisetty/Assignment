package com.service;

import com.model.Employee;

public class TotalCtcToCompany {
	public long SumofSalary(Employee[] empArray) {
		float TotalCtc = 0.0f;
		for (int i = 0; i < empArray.length; i++) {
			TotalCtc += empArray[i].getEmpSalary();
		}
		return (long) TotalCtc;
	}
}
