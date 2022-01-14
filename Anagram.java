package week3.day2assignment;

import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			if (Arrays.equals(text1Array, text2Array)) {
				System.out.println("Both the strings are anagram");
			}
		}

	}

}
