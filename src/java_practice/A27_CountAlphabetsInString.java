package java_practice;

import java.util.Arrays;
import java.util.Scanner;

//Find the alphabet counts in the string 

public class A27_CountAlphabetsInString {

	public static void stringMethod() {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String name: ");
		String name = sc.next();
		System.out.println(name);

		char ch[] = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i = 0; i<ch.length; i++) {
			boolean answer = Character.isAlphabetic(ch[i]);
			if(answer == true) {
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
