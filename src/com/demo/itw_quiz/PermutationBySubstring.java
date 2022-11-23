package com.demo.itw_quiz;
import java.util.*;

public class PermutationBySubstring{
static Set<String> set = new HashSet<>();
static void permute(String s , String answer)
{
	if (s.length() == 0)
	{
		set.add(answer);
		//System.out.println(answer + " ");
		return;
	}
	
	for(int i = 0 ;i < s.length(); i++)
	{
		char ch = s.charAt(i);
		String left_substr = s.substring(0, i);
		String right_substr = s.substring(i + 1);
		String rest = left_substr + right_substr;
		permute(rest, answer + ch);
	}
}

// Driver code
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	
	String s;
	String answer="";
	
	System.out.print("Enter the string : ");
	s = scan.next();
	
	System.out.print("\nAll possible strings are : ");
	permute(s, answer);
	System.out.println(set);
}
}

// This code is contributed by adityapande88
