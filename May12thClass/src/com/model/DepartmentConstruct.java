package com.model;

public class DepartmentConstruct {
	private int deptId;
	private String deptName;
	private EmployeeConstrct[] employees;
	
	public DepartmentConstruct(int deptId, String deptName, EmployeeConstrct[] employees) {
		this.deptId= deptId;
		this.deptName= deptName;
		this.employees= employees;
	}
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public EmployeeConstrct[] getEmployees() {
		return employees;
	}
	public void setEmployees(EmployeeConstrct[] employees) {
		this.employees = employees;
	}
		
		
}
