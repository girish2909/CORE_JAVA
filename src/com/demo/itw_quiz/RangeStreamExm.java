package com.demo.itw_quiz;

import java.util.stream.IntStream;

public class RangeStreamExm {

	public static void main(String[] args) {
		int sum = IntStream.
			range(1,10).
			skip(4).sum();
				System.out.println(sum);
	}
}
//5+6+7+8+9