package week1.day2assignment;

public class PalindromeCheck {

	public static void main(String[] args) {
		int num = 34343;
		int temp = 0;
		int store = num;
		while (num != 0) {
			int remainder = num % 10;
			temp = temp * 10 + remainder;
//			System.out.println("temp:: " + temp);
			num = num / 10;
//			System.out.println("num:: " + num);
		}
//		System.out.println("store:: " + store);

		if (store == temp) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
	}

}
