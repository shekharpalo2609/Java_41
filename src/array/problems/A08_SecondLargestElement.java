package array.problems;

public class A08_SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, 0, 13, 6 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		System.out.println(secondLargest);
	}
}