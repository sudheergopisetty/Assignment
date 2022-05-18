package com.main;

import com.model.Employee;
import com.service.ReturnObjBySal;

public class ArraryObjRetunMain {

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
		emp3.setEmpSalary(20000);

		Employee[] employees = new Employee[3];

		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		
		ReturnObjBySal bySal=new ReturnObjBySal();
		
		Employee[] returnedArrary= bySal.ReturnObjBySalary(employees, 20000);
		
		for (int i = 0; i < returnedArrary.length; i++) {
			System.out.println("Name of the employee who draws 20000 salary :"+returnedArrary[i].getEmpName());
		}
		
		emp1= null;
		emp2= null;
		emp3= null;
				
	}

}
