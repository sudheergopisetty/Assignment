package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.model.Address;
import com.model.Employee;

public class SetOperation {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "Mohan", 12345);
		Employee employee2 = new Employee(2, "Murali", 45667);
		Employee employee3 = new Employee(3, "Rao", 78999);

		Address address = new Address(1, "Perungudi", "Chennai");
		Address address2 = new Address(2, "Perungudi1", "Chennai");
		Address address3 = new Address(3, "Perungudi2", "Chennai");

		Set<Object> set = new HashSet<Object>();

		set.add(employee);
		set.add(employee2);
		set.add(employee3);
		set.add(address);
		set.add(address2);
		set.add(address3);

		System.out.println(set.size());

		for (Iterator<Object> iterator = set.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			
			if (object instanceof Employee) {
				Employee object1 = (Employee) object;
				System.out.println(object1.getEmpName());
				System.out.println(object1.getSalary());
			};
			if (object instanceof Address) {
				Address object1 = (Address) object;
				System.out.println(object1.getDoorNo());
				System.out.println(object1.getCity());
			};
			

		}

	}

}
