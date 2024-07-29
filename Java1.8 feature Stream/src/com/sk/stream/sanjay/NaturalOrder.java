package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.List;

public class NaturalOrder {
	
	
	// Given a list of integers, sort all the values present in it using Stream functions?
	
	// 10,15,8,49,25,98,98,32,15

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=Arrays.asList(10,15,8,49,25,98,32);
		
		l.stream().sorted().forEach(System.out::println);
		
		
	//.stream.fiter(n->30).forEach(System.out::println);
		
		
		
		

	}

}
