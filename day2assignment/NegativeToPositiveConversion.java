package week1.day2assignment;

public class NegativeToPositiveConversion {

	public static void main(String[] args) {
		int number = -40;
		if (number < 0) {
			number = number * (-1);
			if (number > 0) {
				System.out.println("The number -40 is converted to 40");
			}

		}

	}

}
