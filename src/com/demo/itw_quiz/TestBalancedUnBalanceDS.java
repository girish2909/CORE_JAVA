package com.demo.itw_quiz;

import java.util.HashMap;
import java.util.Map;

public class TestBalancedUnBalanceDS {

	public static void main(String[] args){
		Character[] exp={'[','(',']',')','{','}'};
		if(exp.length%2 !=0) {
			System.out.println("imbalnced DS");
		}else {
			new TestBalancedUnBalanceDS().getBalancedOrNot(exp);
		}
	}

	int j=0;
	int k=0;
	public void getBalancedOrNot(Character[] exp){
		Map<Character,Integer> braces = new HashMap();
		braces.put('(',1);
		braces.put(')',-1);
		braces.put('{',2);
		braces.put('}',-2);
		braces.put('[',3);
		braces.put(']',-3);
		
		
		for (int i=0; i<exp.length; i++){
			j = braces.get(exp[i]);

			System.out.println(exp[i] + "=="+j);

		}

	}

	// multithreading messaging que, core java 8
}

