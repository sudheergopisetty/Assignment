package com.service;

import java.util.Scanner;

import com.model.Employee;

public class UpdateOps {
	
	public static Employee[] updateEmployee(Employee[] emps, int empId) {
		int count = emps.length;
		Scanner scan= new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			if (emps[i].getEmpId() == empId) {
				System.out.println("Enter new name");
				String newName = scan.nextLine();
				System.out.println("Enter updated salary");
				float newSalary = scan.nextFloat();
				emps[i].setEmpName(newName);
				emps[i].setSalary(newSalary);
				System.out.println("Updated Sucessfully!!");
				scan.close();
			}
		}
		return emps;
	}

}
