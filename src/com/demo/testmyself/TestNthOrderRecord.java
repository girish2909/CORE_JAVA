package com.demo.testmyself;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestNthOrderRecord {



	public static void main(String[] args) {
		Emp01 e1 = new Emp01(1, "girish", 1000);
		Emp01 e2 = new Emp01(2, "girish", 1000);

		Emp01 e3 = new Emp01(3, "bb", 10060);
		Emp01 e4 = new Emp01(4, "cc", 15000);
		Emp01 e12 = new Emp01(5, "dd", 10070);
		Emp01 e13= new Emp01(6, "ee", 10050);
		Emp01 e14 = new Emp01(7, "ff", 14000);
		Emp01 e15 = new Emp01(8, "gg", 15001);
		Emp01 e16 = new Emp01(9, "hh", 10050);
		Emp01 e17 = new Emp01(10, "jj", 10400);

		List<Emp01> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e12);
		list.add(e13);
		list.add(e14);
		list.add(e15);
		list.add(e16);
		list.add(e17);

		Stream<Emp01> sorted = list.stream().sorted(Comparator.comparing(Emp01::getSalary, Comparator.reverseOrder()));


		System.out.println(sorted.collect(Collectors.toList()).get(1-1).getSalary());

		System.out.println();


	}
}

class Emp01 {
	private int id;
	private String name;
	private int Salary;


	public Emp01(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Salary;

		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp01 other = (Emp01) obj;
		if (Salary != other.Salary)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}




}
