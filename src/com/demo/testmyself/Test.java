package com.demo.testmyself;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) throws Exception {
		char[] chars = new char[] {'\u0097'};
		String str = new String(chars);
		byte[] bytes = str.getBytes();
		System.out.println(Arrays.toString(bytes));
		
		String inputStr ="girishg mishra";
		for(char i :inputStr.toCharArray()){
			if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: "+i);
				break;
			}
		}
	}

	
}