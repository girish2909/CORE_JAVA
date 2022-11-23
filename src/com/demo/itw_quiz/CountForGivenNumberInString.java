package com.demo.itw_quiz;
// Java program to count occurrences
// of a character using Stream

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.*;

public class CountForGivenNumberInString {

	// Method that returns the count of the given
	// character in the string
	public static long count(String s, char ch)
	{

		return s.chars()
			.filter(c -> c == ch)
			.count();
	}

	// Driver method
	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		char c = 'e';
		System.out.println(count(str, c));
		
		// if you want all character set which is repeated more than
		System.out.println(str.chars().filter(e -> e != ' ')
				
		.mapToObj(t -> (char)t)
		
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //store in a map with the count
		
		.entrySet().stream()
	    .filter(e -> e.getValue() == 1)  // filter that outputs the value for 
        .findFirst().get());
		
	    
		
	}
}
