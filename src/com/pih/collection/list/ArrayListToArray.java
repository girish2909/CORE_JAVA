package com.pih.collection.list;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("content of arraylist :"+al);
		
		Integer ia[] = new Integer[al.size()];
		
		ia = al.toArray(ia);
		
		int sum = 0;
		
		for( int i : ia) sum += i;
		
		System.out.println("sum is :"+ sum);
	}
}
