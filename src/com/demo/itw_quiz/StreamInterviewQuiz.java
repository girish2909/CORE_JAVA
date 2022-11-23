package com.demo.itw_quiz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.features.Employee;

public class StreamInterviewQuiz {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("xyz1", 43, 39444));
		list.add(new Employee("xyz2", 23, 20000));
		list.add(new Employee("xyz3", 62, 34555));
		list.add(new Employee("xyz4", 25, 76545));
		list.add(new Employee("xyz5", 65, 33432));
		list.add(new Employee("xyz6", 44, 78746));
		list.add(new Employee("xyz7", 65, 90877));
		list.add(new Employee("xyz8", 45, 56544));
		
		// Fetch list of employee names 
		// having salary <36000 and age >=23
		List<String> l = list.stream().
				filter(e-> e.getAge()>=23 && e.getSalary() <36000).
				map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println(l);
		
		
		// Get the Nth or here 2nd highest salary
		Optional<Integer> salary = 
				list.stream().map(e ->  e.getSalary()).sorted(Comparator.naturalOrder()).skip(2-1).findFirst();
		System.out.println(salary);
		
	}
}
