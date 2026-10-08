package string.problems;

import java.util.Arrays;

//"selenium" → "eeilmnsu"
public class S12_SortString {

	public static void main(String[] args) {
		String str = "selenium";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		System.out.println("After sorting: " + new String(ch));
	}

}
