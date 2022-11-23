package com.demo.itw_quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Salary{
	private Integer salary;
	private String name;
	private int age;
	public Integer getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Salary(Integer salary, String name, int age) {
		super();
		this.salary = salary;
		this.name = name;
		this.age = age;
	}
	
}
public class GetAllSalaryUsingPredicate {

	public static void main(String[] args) {
		List<Salary> list = new ArrayList<>();
		list.add(new Salary(10000, "girish", 40));
		list.add(new Salary(18000, "vineet", 34));
		list.add(new Salary(22000, "amit", 25));
		list.add(new Salary(25000, "ashish", 32));
		
		// Get all employee salary whose age is greater than 32
		list.stream().filter(e -> e.getAge() > 30 && e.getSalary()<=25000)
				.forEach(s -> System.out.println(s.getAge()+" "+s.getName()));
		
		//2n highest salary 
		System.out.println(list.stream().map(e-> e.getSalary()).sorted().skip(1).findFirst().get());
	}
}
