package com.java8.features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {
 public static void main(String[] args) {
	 Map<String, Integer> map = new HashMap<>();
	 BiConsumer<String, Integer> b1= map::put;
		
		b1.accept("Girish", 37);
		
		
		BiConsumer<String, Integer> b2= (K,V) -> map.put(K, V);
		
		b2.accept("Ashish", 41);
		
		
		System.out.println(map);
	
	
}
}
