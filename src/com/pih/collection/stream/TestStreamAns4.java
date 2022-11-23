package com.pih.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAns4 {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101, "siva", 101, "active",2000));
		emplist.add(new Employee(102, "reddy",101, "active",5000));
		emplist.add(new Employee(103, "raju",102, "inactive",6000));
		emplist.add(new Employee(104, "sivam",102, "inactive",4000));
		emplist.add(new Employee(105, "bob", 103,"active",3500));
		emplist.add(new Employee(106, "alice",103, "inactive",3500));
		emplist.add(new Employee(107, "srinu",104, "active",3500));
		
		
		long activeusers = emplist.stream().filter(emp -> "active".equals( emp.getStatus())).count();
		long inactiveusers = emplist.stream().filter(emp -> "inactive".equals( emp.getStatus())).count();

		System.out.println("activeusers :"+activeusers);
		System.out.println("inactiveusers :"+inactiveusers);
	}
}
