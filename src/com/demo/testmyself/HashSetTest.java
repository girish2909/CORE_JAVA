package com.demo.testmyself;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HashSetTest {
	public static void main(String[] args) {
		Customer c3 = new Customer("Aashish", 20);
		Customer c1 = new Customer("John", 20);
		Customer c2 = new Customer("Ashish", 20);
		List<Customer> cu = new ArrayList<>();
		cu.add(c1);
		cu.add(c2);
		cu.add(c3);

	Stream<Customer> sorted = cu.stream().sorted(Comparator.comparing(Customer::getName, Comparator.naturalOrder()));
	sorted.forEach(e -> System.out.println(e.getName()) );
	}
}
class Customer {
	
	private String name;
	private int age;
	
	Customer(String name, int age) {
		this.setName(name);
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}