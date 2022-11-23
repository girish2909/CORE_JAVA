package com.pih.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("F");
		ts.add("S");
		ts.add("D");
		ts.add("Z");
		
		System.out.println("Contents of TreeSet :"+ts);
	}
}
