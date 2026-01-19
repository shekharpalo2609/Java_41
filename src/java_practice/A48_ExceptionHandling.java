/*Exception Handling -> Handle ArrayIndexOutOfBoundsException.Take array size from scanner class and simulate AIOB and InputMismatchError in a 
single try block.Use finally block as well*/

package java_practice;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class A48_ExceptionHandling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		try {
			int size = sc.nextInt();
			int[] array = new int[size];

			array[0] = 88;
			array[1] = 90;
			array[1] = 90;
			array[1] = 90;
			array[1] = 80;

			System.out.println(Arrays.toString(array));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of Bounds");
		} catch (InputMismatchException e) {
			System.out.println("Input mismatch!");
		}
		sc.close();
	}
}