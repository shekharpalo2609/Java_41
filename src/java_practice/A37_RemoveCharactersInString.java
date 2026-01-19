package java_practice;

import java.util.Scanner;

// In the string, remove all the alphabets
public class A37_RemoveCharactersInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the string: ");

		String name = sc.nextLine();
		System.out.println(name.replaceAll("[a-z]", ""));
		sc.close();
	}
}