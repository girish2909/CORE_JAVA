package com.pih.collection.list;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("intial size is "+ al.size());
		
		al.add("C");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");
		
		al.set(0, "T");
		
		
		System.out.println("aFTER ADD size is "+ al.size());
		System.out.println("values : "+ al);
		
		
		ArrayList<String> al0 = new ArrayList<String>();
		al0.add("R");
		al0.add("Y");
		
		
		al.addAll(al0);
		System.out.println("after addall values : "+ al);
		
		
		
		
		al.remove(0);
		al.remove("C");
		
		
		System.out.println("after removal values :"+al);
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("E");
		al1.add("G");
		
		al.removeAll(al1);
		
		
		System.out.println("after removalAll values :"+al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("F");
		al2.add("H");
		
		al.retainAll(al2);
		
		
		System.out.println("after retainall values :"+al);
		
		al.clear();
		
		System.out.println("after clearing content values :"+al);
		
		
	}
}
