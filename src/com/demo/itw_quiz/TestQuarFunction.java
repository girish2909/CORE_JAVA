package com.demo.itw_quiz;

public class TestQuarFunction {

	public static void main(String[] args) {
		QuarFunction<Integer, Integer, Integer, Integer, Integer> quad = (a, b, c, d) -> (a * b * c * d);
		System.out.println(quad.apply(2, 3, 5, 7));
	}
}
