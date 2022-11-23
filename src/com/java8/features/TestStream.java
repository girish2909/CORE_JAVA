package com.java8.features;

import java.util.Arrays;

public class TestStream {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,2};
		Arrays.sort(arr);
		
		Arrays.asList(arr).stream().forEach(i -> System.out.print(arr));

	}
}
