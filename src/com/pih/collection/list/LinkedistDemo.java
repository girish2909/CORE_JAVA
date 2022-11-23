package com.pih.collection.list;

import java.util.*;

public class LinkedistDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("F");
		ll.add("G");
		ll.add("H");
		ll.add("I");
		ll.add("J");
		ll.add("K");
		ll.add("L");
		
		ll.addLast("P");
		ll.addFirst("A");
		
		System.out.println("Original contents of ll "+ ll);
		
		ll.remove("F");
		ll.remove(4);
		System.out.println("contents after removal :"+ll);
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("removed first/last content is :"+ll);
		
		ll.set(3, ll.get(3)+"----Changed");
		
		System.out.println("after modified" + ll);
	}
}
