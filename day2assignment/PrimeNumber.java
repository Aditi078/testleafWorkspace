package week1.day2assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i <= input / 2; i++) {
			int remainder = 13 % i;
			if (remainder == 0) {
				flag = true;
				System.out.println(input + " not a prime");
				break;
			}
		}
		if (flag == false) {
			System.out.println(input + " prime");

		}
	}

}
