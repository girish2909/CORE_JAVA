package com.demo.design_pattern.creational.prototype.client;

import java.util.List;

import com.demo.design_pattern.creational.prototype.Student;
import com.demo.design_pattern.creational.prototype.StudentDAO;

public class TestProxyClient {
    public static void main(String[] args) {

        StudentDAO object = new StudentDAO();
        List<Student> studentsList = object.getAllStudents();

        System.out.println("Original Students List ::");
        studentsList.forEach(System.out::println);
        System.out.println("----------------------------");
        List<Student> dummyStudents = object.clone();
        Student std = new Student();
        std.setName("vineet");
        std.setStudendId("1003");
        System.out.println("Dummy Students List ::");
        dummyStudents.add(std);
        dummyStudents.forEach(System.out::println);
        System.out.println("----------------------------");

        System.out.println("Original Students List ::");
        studentsList.forEach(System.out::println);
    }
}
