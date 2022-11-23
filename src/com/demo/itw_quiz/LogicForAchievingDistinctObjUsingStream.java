package com.demo.itw_quiz;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LogicForAchievingDistinctObjUsingStream {

	public static void main(String[] args) {


		Person lokeshOne = new Person(1, "Lokesh", "Gupta");
		Person lokeshTwo = new Person(1, "Lokesh", "Gupta");
		Person lokeshThree = new Person(1, "Lokesh", "Gupta");
		Person brianOne = new Person(2, "Brian", "Clooney");
		Person brianTwo = new Person(2, "Brian", "Clooney");
		Person alex = new Person(3, "Alex", "Kolen");

		//Add some random persons
		Collection<Person> list = Arrays.asList(alex, 
				brianOne, 
				brianTwo, 
				lokeshOne, 
				lokeshTwo, 
				lokeshThree);

		// Get distinct people by id
		List<Person> distinctElements = list.stream().distinct().collect( Collectors.toList() );

		// Let's verify distinct people
		System.out.println( distinctElements);
		
		
		System.out.println("=======================================================================");
		
		
		
		//Java program to find distinct persons by name
		Person lokesh1 = new Person(1, "A", "B");
		Person lokesh2 = new Person(2, "A", "B");
		Person lokesh3 = new Person(3, "A", "B");
		Person brian1 = new Person(4, "Q", "W");
		Person brian2 = new Person(5, "Q", "W");
		Person alex1 = new Person(6, "Alex", "Kolen");
		 
		//Add some random persons
		Collection<Person> list1 = Arrays.asList(alex1, 
		                                        brian1, 
		                                        brian2, 
		                                        lokesh1, 
		                                        lokesh2, 
		                                        lokesh3);

		// Get distinct objects by key
		List<Person> distinctElements1 = list1.stream()
				.filter(
						distinctByKey(p -> p.getFname() + " " + p.getLname())
						)
		            .collect(Collectors.toList());

		// Again verify distinct people
		System.out.println( distinctElements1 );
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
	{
	    Map<Object, Boolean> map = new ConcurrentHashMap<>();
	    return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}


}
