package com.demo.itw_quiz;

import java.util.Arrays;

public class Test {

	
	// abc acb bac bca cab cba
	
	public static void main(String[] args) {
		String input = "abc";
		getRecord(input);
	
		
	}
	
	public static void getRecord(String input) {
		
		for(int i=0;i<input.length();i++) {
			returnStringCombination(input.charAt(i),input.substring(0,i)+input.substring(i+1, input.length()));
		}
	}
	
	public static void returnStringCombination(char ex, String input) {
		System.out.println(ex+input);
		System.out.println(ex+""+input.charAt(1)+""+input.charAt(0));
	}
}
