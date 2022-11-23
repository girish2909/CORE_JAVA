package com.demo.itw_quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapConvertListToSetExample {
  public static void main(String[] args) {

    List<String> names = Arrays.asList(
         "Peter",
         "Martin",
         "John",
         "Peter",
         "Vijay",
         "John",
         "Peter"
        );
    
    // Convert to set by appending occurance count at end of name 
    Set<String> listToSet = names.stream().map(e -> 
    {
         return e+" ("+Collections.frequency(names, e)+")";
     }).collect(Collectors.toSet());
    
    System.out.println(listToSet);
  }
}