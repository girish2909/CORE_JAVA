package com.java8.features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapVsMap {
	//	flatMap() V/s map() :
	//		1) map() takes a Stream and transform it to another Stream. 
	//	       It applies a function on each element of Stream and store return value into new Stream. 
	//         It does not flatten the stream. 
	//         But flatMap() is the combination of a map and a flat operation i.e, 
	//         it applies a function to elements as well as flatten them.
	
	//		2) map() is used for transformation only, but flatMap() is used for both transformation and flattening.
	
	// Java code for Stream flatMap
	// (Function mapper) to get a stream by
	// replacing the stream with a mapped
	// stream by applying the provided mapping function.

		// Driver code
		public static void main(String[] args)
		{

			
			// Creating a list of Prime Numbers
	        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
	          
	        // Creating a list of Odd Numbers
	        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
	          
	        // Creating a list of Even Numbers
	        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
	  
	        List<List<Integer>> listOfListofInts =
	                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
	  
	        System.out.println("The Structure before flattening is : " +
	                                                  listOfListofInts);
	          
	        // Using flatMap for transformating and flattening.
	        List<Integer> listofInts  = listOfListofInts.stream()
	                                    .flatMap(list -> list.stream())
	                                    .collect(Collectors.toList());
	  
	        System.out.println("The Structure after flattening is : " +
	                                                         listofInts);
			
			
			
			
		}

}
