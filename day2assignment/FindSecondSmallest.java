package week1.day2assignment;

import java.util.Arrays;

public class FindSecondSmallest {

	public static void main(String[] args) {
		int[] data = { 23, 45, 67, 32, 89, 22 };
		Arrays.sort(data); // { 22, 23, 32, 45, 67, 89 }

		int secondSmallestNumber = data.length - 5;
		System.out.println(data[secondSmallestNumber]);
	}

}
