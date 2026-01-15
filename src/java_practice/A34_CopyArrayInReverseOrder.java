package java_practice;

import java.util.Arrays;

//Copy the value of one array into another array in reverse order
public class A34_CopyArrayInReverseOrder {

	public static int[] array = { 11, 22, 33, 44 };

	static int[] copiedArray = new int[array.length];

	public static void copyArrayMethod() {

		for (int i = array.length-1; i >= 0 ; i--) {
			copiedArray[i] = array[i];
		}
		System.out.println("Copied Array : "+Arrays.toString(copiedArray));
	}

	public static void main(String[] args) {
		System.out.println("Original Array: " + Arrays.toString(array));
		copyArrayMethod();
	}
}