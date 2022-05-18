package com.service;

import com.model.Employee;

public class EmployeeIdSearch {
	public boolean searchByEmpId(Employee[] empArray, int id) {
		boolean bool = false;
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i].getEmpId() == id) {
				bool= true;
			}
		}
		return bool;
	}
}
