package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements in a given integers list in java using Stream functions?


public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//string s='aabbccd'
		
		List<Integer> MyList=Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> myset=new HashSet<Integer>();
		
		 MyList.stream()
         .filter(n -> !myset.add(n))
         .forEach(System.out::println);
		

	}

}
