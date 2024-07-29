package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.List;

public class CountNumber {
	
	
	//Given a list of integers, find the total number of elements present in the list using Stream functions?

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList=Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		int count=(int) myList.stream().count();
		System.out.println(count);
		
	}

}
