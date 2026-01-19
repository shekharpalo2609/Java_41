package java_practice;

import java.util.Scanner;

// In the string, remove all the capital letters
public class A38_RemoveCapitalLettersInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the string: ");

		String name = sc.nextLine();
		System.out.println(name.replaceAll("[A-Z]", ""));
		sc.close();
	}
}