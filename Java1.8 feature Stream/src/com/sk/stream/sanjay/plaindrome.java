package com.sk.stream.sanjay;

import java.util.Collections;
import java.util.function.Predicate;

public class plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "paaf";
		
		Predicate<String> CheckPalindrome= s1-> {s1=s.toLowerCase();
		                        return new StringBuilder(s1).reverse().toString().equals(s1);
		 };
		 System.out.println(CheckPalindrome.test(s));
		}

	}
 