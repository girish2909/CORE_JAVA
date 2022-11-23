package com.demo.testmyself;

public class TestPermutation {

	
	public static void main(String[] args) {
		new TestPermutation().permutation("ABC".toCharArray(), 0);
	}


public void permutation(char[] charArray, int i) {

    if(i == charArray.length-1)
   	 System.out.println(String.valueOf(charArray));
    
    for(int j=i; j<charArray.length; j++) {
   	 swap(charArray, i, j);
   	 permutation(charArray, i+1);
   	 swap(charArray, i, j);
    }
		
	}

	private void swap(char[] charArray, int i, int j) {
		// TODO Auto-generated method stub
		char temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j] = temp;
	}
}