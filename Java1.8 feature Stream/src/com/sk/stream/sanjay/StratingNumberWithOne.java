package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.List;

public class StratingNumberWithOne {
	
//	Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//I/P===>	10,15,8,49,25,98,32
	//O/P===>10,15

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,15,8,49,25,98,32);
		
		
		l.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
		
		
		
	}

}
