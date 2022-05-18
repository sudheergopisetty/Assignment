package com.service;

import com.model.EmployeeObj;

public class PrintingObj {

	public String display(EmployeeObj data) {
		return ("Id: "+data.getEmpId() + "\n" +
				"Name: "+ data.getEmpName() +"\n" +
				"Salary: " + data.getEmpSalary()
				);
		
	}
	
}
