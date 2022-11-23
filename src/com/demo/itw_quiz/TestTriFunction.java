package com.demo.itw_quiz;

public class TestTriFunction {

	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer,Integer> abc = (p,q,r) -> p*q*r;
		System.out.println(abc.apply(4,5,6));
		
	}
}
