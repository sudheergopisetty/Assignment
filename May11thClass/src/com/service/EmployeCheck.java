package com.service;

import com.model.DepartmentConstruct;
import com.model.EmployeeConstrct;

public class EmployeCheck {
	public String checkEmployeeName(DepartmentConstruct department, String name) {
		EmployeeConstrct[] returnEmployess= department.getEmployees();
		boolean bool = false;
		int index = 0;
		for (int i = 0; i < returnEmployess.length; i++) {
			if(returnEmployess[i].getEmpName()== name) {
				bool= true;
				index = i;
			}
			}
		if (bool == true) {
			return ("Employee Found and his/her Employee ID is : "+ returnEmployess[index].getEmpId());
		}return "Employee Not Found";
	}
}
