package com.demo.itw_quiz.permutations;

import java.util.LinkedHashSet;
import java.util.Set;

public class PermutationUsingSwap
{
	// Utility function to swap two characters in a character array
	private static void swap(char[] chars, int i, int j)
	{
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;

	}

	// Recursive function to generate all permutations of a string
	private static void permutations(char[] chars, int currentIndex)
	{
		if (currentIndex == chars.length - 1) {
			System.out.println(String.valueOf(chars));
		}

		for (int i = currentIndex; i < chars.length; i++)
		{
			swap(chars, currentIndex, i);
			permutations(chars, currentIndex + 1);
			swap(chars, currentIndex, i);
		}
	}

	public static void findPermutations(String str) {

		// base case
		if (str == null || str.length() == 0) {
			return;
		}else {
			str = str.trim().replace(" ", "");
			str = removeDuplicate(str);
		}

		permutations(str.toCharArray(), 0);
	}

	// generate all permutations of a string in Java
	public static void main(String[] args)
	{
		String str = "hello";
		findPermutations(str);
	}
	
	public static String removeDuplicate(String string) {
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		return sb.toString();
	}
}