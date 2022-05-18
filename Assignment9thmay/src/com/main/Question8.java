/*
 8) display who is drawing higher salary between 2 employees
 */

package com.main;
import com.model.EmployeeObj;
import com.service.HighestSalaryBW2Emp;

public class Question8 {

	public static void main(String[] args) {
		EmployeeObj emp1= new EmployeeObj();
		EmployeeObj emp2= new EmployeeObj();
		
		emp1.setEmpId(15);
		emp1.setEmpName("Mohan Murali Rao");
		emp1.setEmpSalary(400000);
		
		emp2.setEmpId(10);
		emp2.setEmpName("Murali");
		emp2.setEmpSalary(300000);
		
		HighestSalaryBW2Emp compare= new HighestSalaryBW2Emp();
		
		System.out.println(compare.highestSalary(emp1, emp2));
		emp1= null;
		emp2=null;
	}

}
