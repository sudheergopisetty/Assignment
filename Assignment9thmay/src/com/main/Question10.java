/*
 10) pass an employee and give him a hike of x amount 
 */

package com.main;

import com.model.EmployeeObj;

public class Question10 {

	public static void main(String[] args) {
		EmployeeObj emp1= new EmployeeObj();
		
		emp1.setEmpId(15);
		emp1.setEmpName("Mohan Murali Rao");
		emp1.setEmpSalary(400000);
		
		System.out.println(emp1.giveHike(10000));

	}

}
