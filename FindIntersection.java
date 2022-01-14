package week3.day2assignment;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) {
		Integer[] firstArray = { 3, 2, 11, 4, 6, 7 };
		Integer[] secondArray = { 1, 2, 8, 4, 9, 7 };

		HashSet<Integer> set = new HashSet<Integer>();
		set.addAll(Arrays.asList(firstArray));
		set.retainAll(Arrays.asList(secondArray));

		System.out.println(set);

		Integer[] intersection = {};
		intersection = set.toArray(intersection);
		System.out.println(Arrays.toString(intersection));

	}

}
