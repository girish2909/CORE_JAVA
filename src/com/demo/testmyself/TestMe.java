package com.demo.testmyself;

import java.util.function.BiFunction;

public class TestMe {

	
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> fun  = (i,j) -> i +j;

		System.out.println((fun.apply(2,3)));
	}
}
