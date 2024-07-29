package com.sk.stream.sanjay;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
	
	//Given a String, find the first non-repeated character in it using Stream functions?


	public static void main(String[] args) {
		String input = "Java Hungry Blog Alive is Awesome";

        List<Character> result = input.chars() // Stream of String       
                                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                .entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() == 1L)
                         //       .map(Map.Entry::getKey)
                                .map(entry -> entry.getKey())
                                .collect(Collectors.toList());
//                                .findFirst()
//                                .get();
        System.out.println(result);
	}

}
