package com.pih.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class TestStream {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("plain =================="+(end-start));
//		
//		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("parellel =================="+(end-start));ge
		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 10).forEach(x -> {
//			System.out.println("Thread :"+Thread.currentThread().getName() + " : "+ x);
//		}
//		);
//		end = System.currentTimeMillis();
//		System.out.println("plain =================="+(end-start));
//		
//		start = System.currentTimeMillis();
//		IntStream.range(1, 10).parallel().forEach(x -> {
//			System.out.println("Thread :"+Thread.currentThread().getName() + " : "+ x);
//		}
//		);
//		end = System.currentTimeMillis();
//		System.out.println("parellel =================="+(end-start));
		
		List<Employee> employees = getEmployees();
		
		start = System.currentTimeMillis();
		double asDouble = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("normal stream execution time :"+(end-start)+" : average :"+asDouble);
		
		start = System.currentTimeMillis();
		double asDouble1 = employees.stream().parallel().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("parellel stream execution time :"+(end-start)+" : average :"+asDouble1);
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> listEmp = new ArrayList<>();
		for(int i=1; i<=1000;i++) {
			listEmp.add(new Employee(i, "employee"+i, "A"+i, Double.valueOf(new Random().nextInt(1000*100))));
		}
		return listEmp;
	}
}
