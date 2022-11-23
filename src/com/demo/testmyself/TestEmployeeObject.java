package com.demo.testmyself;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployeeObject {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "girish");
		Emp e2 = new Emp(1, "girish");
		Emp e3 = new Emp(2, "ashish");

		List<Emp> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		list.stream().distinct().collect(Collectors.toList()).forEach(
					e -> {
						System.out.println(e.getId() +" "+e.getName());
					}
				);
	}
}

class Emp{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
