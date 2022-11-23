package com.pih.collection.stream;

public class Employee {

	private int empId;
	private String empName;
	private int deptId;
	private String status= "active";
	private String grade;
	private double salary;
	
	public Employee(int id, String name, String grade, double salary) {
		super();
		this.empId = id;
		this.empName = name;
		this.grade = grade;
		this.salary = salary;
	}

	
	public Employee(int empId, String empName, int deptId, String status, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}


	public int getId() {
		return empId;
	}

	public String getName() {
		return empName;
	}

	public String getGrade() {
		return grade;
	}

	public double getSalary() {
		return salary;
	}
	
	

	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public int getDeptId() {
		return deptId;
	}


	public String getStatus() {
		return status;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptId + ", status=" + status
				+ ", grade=" + grade + ", salary=" + salary + "]";
	}
	
	
}
