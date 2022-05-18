package com.service;

import com.model.EmployeeObj;

public class PrintingObj2 {
	public void noDisplay(EmployeeObj data) {
		System.out.println(("Id: "+data.getEmpId() + "\n" +
				"Name: "+ data.getEmpName() +"\n" +
				"Salary: " + data.getEmpSalary()
				));
		
	}
}
