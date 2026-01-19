package java_practice;

import java.util.Scanner;

// In the string, remove all the numeric values
public class A39_RemoveNumbersInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the string: ");

		String name = sc.nextLine();
		System.out.println(name.replaceAll("[0-9]", ""));
		sc.close();
	}
}