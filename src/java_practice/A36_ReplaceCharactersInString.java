package java_practice;

import java.util.Scanner;

// In the string, remove/replace all the 'o' values(take input from Scanner-> eg: school)
public class A36_ReplaceCharactersInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the string: ");

		String name = sc.next();
		System.out.println(name.replace("o", ""));
		sc.close();
	}
}