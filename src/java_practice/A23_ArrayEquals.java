//Check if 2 arrays are equal or not
package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class A23_ArrayEquals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers1 = new int[3];

		for (int i = 0; i <= numbers1.length - 1; i++) {
			System.out.print("Enter the array1 element at index position-> " + i + ":");
			numbers1[i] = sc.nextInt();
			//System.out.println("Entered array element at index position " + i + " is " + numbers1[i]);
		}

		int[] numbers2 = new int[3];

		for (int i = 0; i <= numbers2.length - 1; i++) {
			System.out.print("Enter the array2 element at index position-> " + i + ":");
			numbers2[i] = sc.nextInt();
			//System.out.println("Entered array element at index position " + i + " is " + numbers2[i]);
		}
		
		if(Arrays.equals(numbers1,numbers2)==true) {
			System.out.println("both arrays are equal");
		}
		else {
			System.out.println("both arrays are not equal");
		}
		sc.close();
	}
}