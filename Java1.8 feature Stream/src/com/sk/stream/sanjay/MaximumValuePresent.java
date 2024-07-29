package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.List;

public class MaximumValuePresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> mylist=Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		int max=mylist.stream().max(Integer::compare).get();
		System.out.println(max);

	}

}
