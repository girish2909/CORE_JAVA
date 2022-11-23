package com.java8.features;

public class Employee1 {

	private int Id;
	private String name;
	private int age;
	private String gender;
	private String deptName;
	private int since;
	private int salary;
	
	public Employee1(int id, String name, int age, String gender, String deptName, int since, int salary) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deptName = deptName;
		this.since = since;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [Id=" + Id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deptName="
				+ deptName + ", since=" + since + ", salary=" + salary + "]";
	}
	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDeptName() {
		return deptName;
	}
	public int getSince() {
		return since;
	}
	public int getSalary() {
		return salary;
	}
	
	
	
	
	
}
