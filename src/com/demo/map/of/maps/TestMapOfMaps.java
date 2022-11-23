package com.demo.map.of.maps;

import java.util.HashMap;
import java.util.Map;

public class TestMapOfMaps {

	
	public static void main(String[] args) {
		HashMap<String,HashMap> map =new HashMap<>();
		
		HashMap<String,Map> childMap = new HashMap<>();
		HashMap<String,String> supperMostChild = new HashMap<>();
		supperMostChild.put("a","a0");
		supperMostChild.put("a1","a10");
		supperMostChild.put("a2","a20");
		HashMap<String,String> supperMostChild1 = new HashMap<>();
		supperMostChild1.put("a3","a30");
		supperMostChild1.put("a4","a40");
		supperMostChild1.put("a5","a50");
		
		childMap.put("child1", supperMostChild);
		childMap.put("child2", supperMostChild1);
		map.put("abc", childMap);
		System.out.println(map);
		
		map.values().forEach(e -> System.out.println(e.values()));
	}
}
