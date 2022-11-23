package com.demo;

import java.util.Properties;

public class TestBooleanClassMethod {
	static boolean yesOrNo(String s) {
		s = s.toLowerCase();
		if(s.equals("yes") || s.equals("y") || s.equals("t"))
			s="true";
		return Boolean.getBoolean(s);
	}

	public static void main(String[] args) {
		System.out.println(yesOrNo("true") + " " + yesOrNo("Yes"));
		
		
		
		// call a method to set a property
				setProperty();
				// check if the property is existing
				// and it is equal to true
				Boolean testBoolean = Boolean.getBoolean("test.boolean");		
				
				// print the result
				System.out.println("Result:"+testBoolean);
	}
	
	
	/*
	 * This is a method to set a property
	 * to test out the getBoolean method
	 */
	public static void setProperty(){
		// instantiate a new Properties
		// equal to system properties
		Properties prop = System.getProperties();
		
		// set a property with key as test.boolean
		// and value is true
		prop.setProperty("test.boolean", "true");
	}
}
