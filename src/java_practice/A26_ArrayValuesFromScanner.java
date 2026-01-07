package java_practice;

import java.util.Scanner;

/*
	Create a array of datatype int of size 3 and takes the value of array using Scanner class
*/

public class A26_ArrayValuesFromScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[3];

		for (int i = 0; i <= numbers.length - 1; i++) {
			System.out.print("Enter the array element at index position-> " + i +":");
			numbers[i] = sc.nextInt();
			System.out.println("Entered array element at index position " +i+ " is "+ numbers[i]);
		}
		sc.close();
	}

}
