package com.service;

import com.model.DepartmentConstruct;
import com.model.EmployeeConstrct;

public class ArraryObjReturn {
	int count1;

	public EmployeeConstrct[] checkEmployeeName(DepartmentConstruct department, String name) {
		EmployeeConstrct[] returnEmployess = department.getEmployees();
		int count = 0;
		for (int i = 0; i < returnEmployess.length; i++) {
			if (returnEmployess[i].getEmpName() == name) {
				count++;
			}
		}
		
		EmployeeConstrct[] filteredArray= new EmployeeConstrct[count];
		
		for (int i = 0; i < returnEmployess.length; i++) {
			if (returnEmployess[i].getEmpName() == name) {
				filteredArray[count1]= returnEmployess[i];
				count1++;
			}
		}
		return filteredArray;

	}
}
