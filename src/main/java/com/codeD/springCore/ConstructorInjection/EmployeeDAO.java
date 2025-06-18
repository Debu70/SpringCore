package com.codeD.springCore.ConstructorInjection;

public class EmployeeDAO {
	
	private long empId;
	private String empName;
	private String empDepartment;
	
	
	public EmployeeDAO(long empId, String empName, String empDepartment) {
		super();
		System.out.println("Parameterized constructor");
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
	}


	@Override
	public String toString() {
		return "EmployeeDAO [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "]";
	}
	
	
	
}
