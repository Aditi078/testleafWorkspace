package week3.day2assignment;

// Check number of occurrences of a char (eg 'e') in a String

//  String str = "welcome to chennai";

// declare and initialize a variable count to store the number of occurrences

// convert the string into char array

//get the length of the array

// traverse from 0 till the array length 

// Check the char array has the particular char in it 

// if is has increment the count

// print the count out of the loop

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";
		int count = 0;

		char[] strArray = str.toCharArray();

		for (int i = 0; i <= strArray.length - 1; i++) {
			if (strArray[i] == 'e') {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
