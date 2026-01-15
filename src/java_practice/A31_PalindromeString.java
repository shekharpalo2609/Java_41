package java_practice;

import java.util.Scanner;

public class A31_PalindromeString {


	public static void palindromeMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String name = sc.nextLine();
		char ch[] = name.toCharArray();
		String reverse = "";

		for (int i = ch.length-1; i>= 0; i--) {
			
			reverse = reverse + ch[i];
		}
		if(name.equals(reverse)) {
			System.out.println("String is palindrome !");
		}
		else {
			System.out.println("String is not palindrome !");
		}
		sc.close();
	}

	public static void main(String[] args) {
		palindromeMethod();
	}
}
