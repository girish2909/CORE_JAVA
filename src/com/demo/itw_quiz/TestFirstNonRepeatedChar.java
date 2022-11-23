package com.demo.itw_quiz;

public class TestFirstNonRepeatedChar {
	//Find First Non repeating character : 
	public static void main(String[] args) {
		String str = "giritshg mishra".toLowerCase();
		str = str.replace(" ","");
		int out = 0;
		for(int i = 0 ; i< str.length(); i++) {
			char firstChar = str.charAt(i);
			for(int j=i+1; j < str.length(); j++) {
				char local = str.charAt(j);
				if(firstChar == local) {
					str = str.replace(String.valueOf(local), "" );
					out++;
					break;
				}
			}
			if(out == 1 ) {
				out = 0;
			}else {
				System.out.println(firstChar);
				break;
			}
		}
	}
}
