package com.main;

import com.model.Employee;
import com.service.EmployeeIdSearch;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.setEmpId(10);
		emp1.setEmpName("Mohan");
		emp1.setEmpSalary(10000);
		
		Employee emp2 = new Employee();
		
		emp2.setEmpId(20);
		emp2.setEmpName("Murali");
		emp2.setEmpSalary(20000);
		
		Employee emp3 = new Employee();
		
		emp3.setEmpId(30);
		emp3.setEmpName("Rao");
		emp3.setEmpSalary(30000);

		Employee[] employees= new Employee[3];
		
		employees[0]= emp1;
		employees[1]= emp2;
		employees[2]= emp3;
		
		EmployeeIdSearch employeeIdSearch= new EmployeeIdSearch();
		boolean ans= employeeIdSearch.searchByEmpId(employees, 20);
		if (ans== true) {
			System.out.println("Employee Found");
		} else {
			System.out.println("Not Found !!!");
		}
		
		emp1= null;
		emp2= null;
		emp3= null;
	}

}
