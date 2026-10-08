package array.problems;

import java.util.Arrays;

public class A05_ReverseArrayPrinting {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = new int[arr1.length];
		for (int i = arr1.length - 1; i >= 0; i--) {
			arr2[i] = arr1[arr1.length - 1 - i];
		}
		System.out.print(Arrays.toString(arr2));
	}
}