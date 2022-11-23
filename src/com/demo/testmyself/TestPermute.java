package com.demo.testmyself;

public class TestPermute {
	
	public void swap(char[] input,int i, int j) {
		char temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
	
	public void permutation(char[] mainInput, int intialIdx) {
		if(intialIdx == mainInput.length-1	) {
			System.out.println(String.valueOf(mainInput));
		}
		for(int i = intialIdx; i < mainInput.length; i++) {
			swap(mainInput, intialIdx, i);
			permutation(mainInput, intialIdx+1);
			swap(mainInput, intialIdx, i);
		}
	}
	
	
	public static void main(String[] args) {
		new TestPermute().permutation("ABC".toCharArray(), 0);
	}
}
