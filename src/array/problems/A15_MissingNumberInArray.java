package array.problems;

public class A15_MissingNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 6, 7 };
		int sumOfArray = 0;
		int expectedSum = 0;
		for (int num : arr) {
			sumOfArray = sumOfArray + num;
		}
		for (int i = 1; i <= arr.length + 1; i++) {
			expectedSum = expectedSum + i;
		}
		System.out.println(sumOfArray);
		System.out.println(expectedSum);
		System.out.println("missing number in array: " + (expectedSum - sumOfArray));
	}

}
