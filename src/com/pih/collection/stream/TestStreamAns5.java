package com.pih.collection.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TestStreamAns5 {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(101, "siva", 101, "active",2000));
		emplist.add(new Employee(102, "reddy",101, "active",5000));
		emplist.add(new Employee(103, "raju",102, "inactive",6000));
		emplist.add(new Employee(104, "sivam",102, "inactive",4000));
		emplist.add(new Employee(105, "bob", 103,"active",3500));
		emplist.add(new Employee(106, "alice",103, "inactive",3500));
		emplist.add(new Employee(107, "srinu",104, "active",3500));
		
		
		Map<Integer, Optional<Employee>> topSalaryEmpDeptWise = 
				emplist
				.stream()
				.collect(
						Collectors.groupingBy(Employee::getDeptId,
												Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))
											)
						);
		
		topSalaryEmpDeptWise.entrySet().forEach(entry ->{
			System.out.println("dept : "+entry.getKey()+", employee"+entry.getValue());
		});
	}
}
