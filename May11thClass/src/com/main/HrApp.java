package com.main;

import com.model.Department;
import com.model.Employee;

public class HrApp {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		
		employee1.setEmpId(10);
		employee1.setEmpName("Mohan Murali Rao");
		employee1.setEmpSalary(30000f);
		employee1.setEmpContact("8886077232");

		Employee employee2 = new Employee();
		
		employee2.setEmpId(121);
		employee2.setEmpName("Gopi");
		employee2.setEmpSalary(29500f);
		employee2.setEmpContact("7013872747");
		
		Department department = new Department();
		
		department.setDeptId(1);
		department.setDeptName("Development");
		department.setEmployee(employee1);
		
		System.out.println("Development Department Employee name: "+ department.getEmployee().getEmpName());
		
		
		Department department1 = new Department();
		
		department1.setDeptId(2);
		department1.setDeptName("Testing");
		department1.setEmployee(employee1);
		
		department.setEmployee(employee2);
		
		System.out.println("Development Department Replaced Employee name: "+ department.getEmployee().getEmpName());
		System.out.println("Testing Department Employee name: "+ department1.getEmployee().getEmpName());
		
		employee1= null;
		employee2= null;
		department= null;
		department1= null;
	}

}
