package com.demo;

import java.util.HashMap;
import java.util.Map;

public class TestHashCode {

	public static void main(String[] args) {
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(1);
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "girish");
		map.put(e2, "girish");
		System.out.println("Size of employee map ->"+ map.size());
		
		Character c1 = new Character('a');
		Character c2 = new Character('a');
		Map<Character, String> map1 = new HashMap<>();
		map1.put(c1, "girish");
		map1.put(c2, "girish");
		System.out.println("Size of employee map ->"+ map1.size());
	}
}

class Employee{
	private Integer i;
	public Employee(Integer i) {
		this.i = i;
	}
	
}
