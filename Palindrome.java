package week3.day2assignment;

public class Palindrome {

	public static void main(String[] args) {

//		a) Declare A String value as"madam"

		String s = "madam";

//		b) Declare another String rev value as ""

		String rev = "";

//		c) Iterate over the String in reverse order 

		for (int i = s.length() - 1; i >= 0; i--) {

//		d) Add the char into rev

			rev = rev + s.charAt(i);

		}

//		 e) Compare the original String with the reversed String, if it is same then print palinDrome

		if (s.equalsIgnoreCase(rev)) {

			System.out.println(s + " is palindrome");

		}

	}

}
