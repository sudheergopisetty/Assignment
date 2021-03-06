package com.model;

public class Employee extends Address{
	
	private int empId;
	private String empName;
	private float salary;
	private String designation;
	private Address address;
	
	public Employee() {
		this.empId=00;
		this.empName="None";
		this.salary=00;
	}
	
	public Employee(int empId, String empName, float salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee(int empId, String empName, float salary, String designation,
			Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
