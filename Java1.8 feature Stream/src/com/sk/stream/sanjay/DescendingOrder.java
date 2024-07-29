package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
	//Given a list of integers, sort all the values present in it in descending order using Stream functions?
   //  I/p===>10,15,8,49,25,98,98,32,15
	//o/p===>

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mylist=Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		mylist.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		

	}

}
