package java_practice;

import java.util.Arrays;
import java.util.Scanner;

//Find the numeric counts in the string 

public class A28_CountNumbersInString {

	static int count;
	public static void stringMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the String name: ");
		String name = sc.next();
		// System.out.println(name);

		char ch[] = name.toCharArray();
		System.out.println(Arrays.toString(ch));

		for (int i = 0; i < ch.length; i++) {
			boolean answer = Character.isDigit(ch[i]);
			if (answer == true) {
				count++;
			}
		}
		System.out.println("No. of alphabets in the given String is: " + count);

		sc.close();

	}

	public static void main(String[] args) {
		stringMethod();
	}
}
