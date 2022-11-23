package com.demo.itw_quiz.permutations;
public class PermutationUsingSubStringAndCharacter
{
    // Recursive function to generate all permutations of a string
    private static void permutations(String candidate, String remaining)
    {
        // base case
        if (remaining == null) {
            return;
        }
 
        if (remaining.length() == 0) {
            System.out.println(candidate);
        }
 
        for (int i = 0; i < remaining.length(); i++)
        {
            String newCandidate = candidate + remaining.charAt(i);
 
            String newRemaining = remaining.substring(0, i) +
                    remaining.substring(i + 1);
 
            permutations(newCandidate, newRemaining);
        }
    }
 
    // Find Permutations of a string in Java
    public static void main(String[] args)
    {
        String str = "ABC";
        permutations("", str);
    }
}