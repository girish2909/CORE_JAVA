package com.demo.testmyself;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= sc.nextLine(); //reads string.
		System.out.print("Enter next string: ");
		String str1= sc.nextLine();
		System.out.println(str+"==="+str1);
		
		
	}
	
	public void doAction(String str, String str1) {
		Integer numbers= Integer.parseInt(str);
		String[] values = str1.split(" ");
		
	}
	
	
}
