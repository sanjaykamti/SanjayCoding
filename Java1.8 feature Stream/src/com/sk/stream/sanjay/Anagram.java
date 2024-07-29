package com.sk.stream.sanjay;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram (String s1, String s2) {
	
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] chars1=s1.toCharArray();		
		char[] chars2=s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		return Arrays.equals(chars1, chars2);		
	}

	public static void main(String args[]) {
		
		String s1="LisTen";
		String s2="Silent";
		
		if(isAnagram(s1, s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
		
		
	}
}
