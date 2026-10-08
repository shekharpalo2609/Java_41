package array.problems;

public class A01_FindLargestElement {

	public static void main(String[] args) {

		int[] arr = { 2, 4, -5, 19, 8 };
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}

		}
		System.out.println(max + " is the largest element");

	}

}
