package java_practice;

import java.util.Arrays;

//Copy the value of one array into another array
public class A33_CopyOneArrayToAnother {

	public static int[] array = { 49, 41, 24, 41 };

	static int[] copiedArray = new int[array.length];

	public static void copyArrayMethod() {

		for (int i = 0; i < array.length; i++) {
			copiedArray[i] = array[i];
		}
		System.out.println("Copied Array from method 1: "+Arrays.toString(copiedArray));
	}

	public static void main(String[] args) {
		System.out.println("Original Array: " + Arrays.toString(array));
		copyArrayMethod();
	}
}