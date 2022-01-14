package week3.day2assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] spaceRemove = text.split(" ");

		// convert String array to LinkedHashSet to remove duplicates
		LinkedHashSet<String> setWords = new LinkedHashSet<String>(Arrays.asList(spaceRemove));
		//System.out.println(setWords);
		// join the words again by space
		StringBuilder temp = new StringBuilder();
		int index = 0;

		for (String s : setWords) {

			if (index > 0)
				temp.append(" ");

			temp.append(s);
			index++;
		}

		text = temp.toString();
		System.out.println(text);
	}

}
