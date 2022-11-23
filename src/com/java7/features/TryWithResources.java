package com.java7.features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		String str = null;
	    StringBuilder strb = new StringBuilder();

	    // the following line means the try block takes care of closing the resource
	    try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
	        while ((str = br.readLine()) != null) {
	            strb.append(str).append("\n");
	        }
	    } catch (FileNotFoundException f) {
	        System.out.println("input.txt" + " does not exist");
	    } catch (IOException e) {
	    	
	        e.printStackTrace();
	    }
System.out.println(strb);
	}
}
