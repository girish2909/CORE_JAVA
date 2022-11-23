package com.demo.design_pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements Cloneable {

	private static List<Student> studentList;
	
	static {
		studentList = new ArrayList<>();

		Student student1 = new Student();
		student1.setName("girish");
		student1.setStudendId("1001");
		
		Student student2 = new Student();
		student2.setName("ashish");
		student2.setStudendId("1002");
		
		studentList.add(student1);
		studentList.add(student2);
	}
	
	public List<Student> getAllStudents(){
		return studentList;
	}
	
	@Override
	public List<Student> clone() {

		List<Student> dummyStudents = new ArrayList<>();
		for(Student student : studentList) {
			dummyStudents.add(student);
		}
		return dummyStudents;
	}
	
	
	
}
