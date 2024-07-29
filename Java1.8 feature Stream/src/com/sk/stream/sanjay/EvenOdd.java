package com.sk.stream.sanjay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**Given a list of integers, find out all the even numbers exist in the list using Stream functions?***/

//********//////10,15,8,49,25,98,32////////////////
//10,8,98,32

public class EvenOdd {
	
	
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(10,15,8,49,25,98,32);
		
		l.stream().sorted().filter(n->n%2==0).forEach(System.out::print);
	
		System.out.println();
		
		l.stream().sorted().filter(a->a%2!=0).forEach(System.out::print);
		
	}

}
