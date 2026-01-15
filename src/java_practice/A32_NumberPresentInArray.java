package java_practice;

import java.util.Scanner;

//In the given array, check a particular number is present or not. If present, also show how many times present

public class A32_NumberPresentInArray {

	public static void arrayMethod() {
		int[] array = new int[4];

		array[0] = 49;
		array[1] = 41;
		array[2] = 24;
		array[3] = 41;
		int count = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number which is to be checked in the array: ");
		int number = sc.nextInt();

		for (int arr : array) {
			if (arr == number) {
				count++;
			}
		}
		if(count >= 1) {
			System.out.println(number+" is present in the array " + count + " times!");
		}
		else {
			System.out.println(number+" is not present in the array!");
		}
		sc.close();
	}

	public static void main(String[] args) {
		arrayMethod();
	}
}