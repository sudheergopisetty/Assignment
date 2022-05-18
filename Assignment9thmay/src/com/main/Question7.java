/*
 7) pass an object as argument 

	display(  Department dept) 
	{
	  // display the details 
	}
 */

package com.main;

import com.model.EmployeeObj;
import com.service.PrintingObj2;

public class Question7 {

	public static void main(String[] args) {
		EmployeeObj employeeObj= new EmployeeObj();
		
		employeeObj.setEmpId(5000);
		employeeObj.setEmpName("STGIT");
		employeeObj.setEmpSalary(400000);
		
		PrintingObj2 data= new PrintingObj2();
		data.noDisplay(employeeObj);
		employeeObj= null;
	}
	

}
