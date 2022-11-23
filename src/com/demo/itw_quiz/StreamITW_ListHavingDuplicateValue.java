package com.demo.itw_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamITW_ListHavingDuplicateValue {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);intList.add(11);intList.add(21);intList.add(41);intList.add(16);intList.add(41);
		intList.add(32);intList.add(12);intList.add(22);intList.add(32);intList.add(12);intList.add(21);
		
		intList = intList.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		System.out.println(intList);
		
		// ArrayList with duplicate elements
		ArrayList<Integer> numbersList
		= new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
		 
		Map<Integer, Long> elementCountMap = numbersList.stream()
		                                     .collect(
		                                    		 	Collectors.toMap(Function.identity(), v -> 1L, Long::sum)
		                                    		 	);
		 
		System.out.println(elementCountMap);
		
		
	}
}
