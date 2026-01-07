package java_practice;

import java.util.Scanner;

/*
	Create an array for Student the size of array should be coming from the Scanner Class
*/

public class A25_ArraySizeFromScanner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		String[] names =new String[size];
		System.out.println("Entered size is: " + size);
		
		sc.close();
	}

}
