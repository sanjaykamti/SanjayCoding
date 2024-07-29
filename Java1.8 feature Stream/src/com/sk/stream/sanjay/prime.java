package com.sk.stream.sanjay;

import java.util.stream.IntStream;

public class prime {
	
	public static void main(String[] args) {
		
		int limit=100;
		
		IntStream.rangeClosed(2, limit)
		.filter(prime::isPrime).forEach(System.out::println);
		}

	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		if(num<=3) {
			return false;
		}
		if(num%2==0 || num%3==0) {
			return false;
		}
		for(int i=5;i*i<=num;i+=6) {
			if(num%i==0|| num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
}
