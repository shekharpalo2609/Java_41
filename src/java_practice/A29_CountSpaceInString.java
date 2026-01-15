//Find the space counts in the string "Shekhar @ 123"

package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class A29_CountSpaceInString {

	static int count=0;
	public static void stringMethod() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String name = sc.nextLine();
		//System.out.println(name);
		char ch[] = name.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i = 0; i<ch.length; i++) {
			boolean answer = Character.isSpaceChar(ch[i]);
			if(answer == true) {
				count++;
			}
		}
		System.out.println("No. of spaces in the entered String is: " +count);
		sc.close();
	}
	
	public static void main(String[] args) {
		stringMethod();
	}
}
