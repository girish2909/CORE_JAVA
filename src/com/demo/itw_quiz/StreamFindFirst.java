package com.demo.itw_quiz;

import java.util.stream.Stream;
public class StreamFindFirst {

	public static void main(String[] args) {
		Stream.of("Ashish","Girish","Vineet","Gyan","Gaurav")
		.filter( e -> e.startsWith("G"))
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);

	}
}
