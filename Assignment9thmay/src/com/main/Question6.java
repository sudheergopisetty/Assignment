/*
 6) return  an object

 */

package com.main;

import com.model.EmployeeObj;
import com.service.PrintingObj;

public class Question6 {
	public static void main(String[] args) {
		EmployeeObj emp1= new EmployeeObj();
		
		emp1.setEmpId(100);
		emp1.setEmpName("Mohan Murali Rao");
		emp1.setEmpSalary(400000);
		
		PrintingObj data= new PrintingObj();
		System.out.println("Employee Data is as below: "+ "\n" +data.display(emp1));
		emp1= null;
	}
}
