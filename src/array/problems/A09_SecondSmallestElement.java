package array.problems;

public class A09_SecondSmallestElement {

	public static void main(String[] args) {

		int arr[] = { 8, 5, 9, 1, 4 };

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : arr) {

			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}
		System.out.println("Second Smallest = " + secondSmallest);
	}
}