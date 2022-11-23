package com.demo.testmyself;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestBalancedUnbalanced {

	public static boolean getBalancedOrUnbalanced(String str) {

		Deque<Character> stack = new ArrayDeque<>();

		for(int i = 0 ; i< str.length(); i++) {
			char currentValue = str.charAt(i);
			if(currentValue == '(' || currentValue == '['|| currentValue == '{' ) {
				stack.push(str.charAt(i));
				continue;
			}

			char popepup;
			
			switch(currentValue) {
			case '}' :
				popepup= stack.pop();
				if(popepup == '(' || popepup == '[')
					return false;
				break;
			case ']' :
				popepup= stack.pop();
				if(popepup == '{' || popepup == '(')
					return false;
				break;
			case ')' :
				popepup= stack.pop();
				if(popepup == '{' || popepup == '[')
					return false;
				break;
			}


		}
		return stack.isEmpty();
	}



	public static void main(String[] args) {
		if(getBalancedOrUnbalanced("{(())}")) {
			System.out.println("Balaced");
		}else {
			System.out.println("unbalanced");
		}
	}
}
