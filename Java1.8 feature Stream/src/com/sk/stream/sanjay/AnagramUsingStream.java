package com.sk.stream.sanjay;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class AnagramUsingStream {

	public static boolean areAnagram(String s1, String s2) {
	
		s1=s1.replaceAll("\\s","" ).toLowerCase();
		s2=s2.replaceAll("\\s","" ).toLowerCase();
		
		if(s1.length()!=s2.length()) {
			return false;
		}
 
		Predicate<Character> isChars1=ch->s1.chars().anyMatch(c-> c == ch);
		
		return s2.chars().allMatch(ch->isChars1.test((char) ch));
	}
//		Map<Character, Integer> freq1=new HashMap<>();
//		Map<Character, Integer> freq2=new HashMap<>();
//		
//		for(char c: s1.toCharArray()) {
//			freq1.put(c, freq1.getOrDefault(c,0)+1);
//			}
//		for(char c: s1.toCharArray()) {
//		freq1.put(c, freq1.getOrDefault(c,0)+1);
//		}
//		return freq1.equals(freq2);
//	}
//	
	public static void main(String[] args) {
		
		String s1="Yash";
		String s2="Yash";
		
		if(areAnagram(s1,s2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
		}
		
	}

