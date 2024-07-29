package com.sk.stream.sanjay;

import java.util.stream.Collectors;

public class Vowelpresent {

	public static void main(String[] args) {
		
	    String a1="Hello my name is jatin";
     	a1=a1.toLowerCase();
     	
     	String vowelF=a1.chars().mapToObj(c->(char) c).filter(c->"aieou".contains(String.valueOf(c)))
     			.distinct().map(String::valueOf).collect(Collectors.joining());
//		int len=a1.length();
//		String vowelF="";
//		for(int  i=0;i<len;i++) {
//			if(a1.charAt(i)== 'a'|| a1.charAt(i)== 'i'|| a1.charAt(i)== 'e'||a1.charAt(i)== 'o'||a1.charAt(i)== 'u' ) {
//			vowelF+=a1.charAt(i);
//			}
//			
//		}
		if(!vowelF.isEmpty()) {
			System.out.println("Vowel present" + " "+ vowelF);
		}
		else {
			System.out.println("Not Present");
		}
	}

}
