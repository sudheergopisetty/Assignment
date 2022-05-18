package com.main;

import com.model.DepartmentConstruct;
import com.model.EmployeeConstrct;
import com.service.ArraryObjReturn;

public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeConstrct[] employees = new EmployeeConstrct[4];

		EmployeeConstrct employee1 = new EmployeeConstrct(10, "Mohan Murali Rao", 30000f, "8886077232");

		EmployeeConstrct employee2 = new EmployeeConstrct(121, "Gopi", 29500f, "7013872747");
		
		EmployeeConstrct employee3 = new EmployeeConstrct(10, "Mohan Murali Rao", 30000f, "8886077232");

		EmployeeConstrct employee4 = new EmployeeConstrct(121, "Gopi", 29500f, "7013872747");

		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;

		DepartmentConstruct department = new DepartmentConstruct(1, "Development", employees);

//		EmployeeConstrct[] returnEmployess = department.getEmployees();
//		for (int i = 0; i < returnEmployess.length; i++) {
//			System.out.println(returnEmployess[i].getEmpName());
//		}

		ArraryObjReturn check = new ArraryObjReturn();
		EmployeeConstrct[] status = check.checkEmployeeName(department, "Mohan Murali Rao");

		System.out.println(status);
		for (int i = 0; i < status.length; i++) {
			System.out.println(status[i].getEmpName());
		}

		employee1 = null;
		employee2 = null;
		employee3 = null;
		employee4 = null;
		department = null;

	}

}
