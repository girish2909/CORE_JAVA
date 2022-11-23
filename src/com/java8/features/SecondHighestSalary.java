package com.java8.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class EmployeeObj{
	private String name;
	private int salary;
	public EmployeeObj(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	
}
public class SecondHighestSalary {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<EmployeeObj> listEmployee = new ArrayList<>();
		EmployeeObj obj1 = new EmployeeObj("girish", 1030);
		EmployeeObj obj2 = new EmployeeObj("girish", 1020);
		EmployeeObj obj3 = new EmployeeObj("girish", 1300);
		EmployeeObj obj4 = new EmployeeObj("girish", 1040);
		EmployeeObj obj5 = new EmployeeObj("girish", 13400);
		listEmployee.add(obj5);
		listEmployee.add(obj1);
		listEmployee.add(obj2);
		listEmployee.add(obj3);
		listEmployee.add(obj4);
		
		/// only 2nd highest salary is need then use map -> collect -> stream -> sorted -> skip -> findfirst
		Optional<Integer> findFirst = listEmployee.stream().
		map(EmployeeObj::getSalary)
		.collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		System.out.println(findFirst.get());
		System.out.println();
		
		/// only 2nd highest salary is need then use map -> collect -> stream -> sorted with comparingDouble -> reversed -> findfirst
		Optional<EmployeeObj> emp = listEmployee.stream()
		        .sorted(Comparator.comparingDouble(EmployeeObj::getSalary).reversed()).skip(1).findFirst();

		System.out.println(emp.get().getSalary());
	}


}
