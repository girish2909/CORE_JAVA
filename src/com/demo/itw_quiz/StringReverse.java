package com.demo.itw_quiz;
//Java program to reverse a string using recursion
//https://www.geeksforgeeks.org/reverse-a-string-using-recursion/?ref=lbp
class StringReverse
{
	/* Function to print reverse of the passed string */
	void reverse(String str)
	{
		if ((str==null)||(str.length() == 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		String str = "Girish Kumar Mishra";
		StringReverse obj = new StringReverse();
		obj.reverse(str);
	}
}
