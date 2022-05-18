/*
 11) employee find where his age is >=18 and <=58 
 */

package com.main;

import com.model.EmployeeObj;
import com.service.EligibleToWork;

public class Question11 {

	public static void main(String[] args) {
		EmployeeObj emp1= new EmployeeObj();
		
		emp1.setEmpId(15);
		emp1.setEmpName("Mohan Murali Rao");
		emp1.setEmpSalary(400000);
		emp1.setEmpAge(25);
		
		EligibleToWork isEligible= new EligibleToWork();
		
		System.out.println(isEligible.checkEligibleToWork(emp1));

	}

}
