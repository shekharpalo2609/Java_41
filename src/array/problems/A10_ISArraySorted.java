package array.problems;

public class A10_ISArraySorted {
	public static void main(String[] args) {
		boolean isSorted = true;
		int arr[] = { 5, 10, 15, 20, 21};

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("array is not sorted");
		}
	}
}