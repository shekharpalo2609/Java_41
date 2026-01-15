package java_practice;

import java.util.Scanner;

public class A30_CountSpecialCharactersInString {

	static int countOfSpace, countOfNumbers, countOfAlphabets, countOfSpecialCharacter;

	public static void stringMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String name = sc.nextLine();
		char ch[] = name.toCharArray();

		for (char c : ch) {
			if (Character.isWhitespace(c)) {
				countOfSpace++;
			}

			else if (Character.isDigit(c)) {
				countOfNumbers++;
			} else if (Character.isLetter(c)) {
				countOfAlphabets++;
			} else {
				countOfSpecialCharacter++;
			}
		}
		System.out.println("No. of spaces in the string: " + countOfSpace);
		System.out.println("No. of numbers in the string: " + countOfNumbers);
		System.out.println("No. of alphabets in the string: " + countOfAlphabets);

		System.out.println("No. of special characters in the string: " + countOfSpecialCharacter);
		sc.close();
	}

	public static void main(String[] args) {
		stringMethod();
	}
}
