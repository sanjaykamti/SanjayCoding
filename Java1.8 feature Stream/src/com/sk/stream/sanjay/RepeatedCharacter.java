package com.sk.stream.sanjay;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Java is Awesome but Phython is also a trending language";

        List<Character> result = input.chars() // Stream of String       
                                .mapToObj(s -> Character.toLowerCase((char) s)) // First convert to Character object and then to lowercase         
                                .filter(ch -> ch!= ' ')
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                .entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() > 1L)
                                .map(entry -> entry.getKey())
                                .collect(Collectors.toList());
//                                .findFirst()
//                                .get();
        System.out.println(result);                    

		
		
		
	}

}
