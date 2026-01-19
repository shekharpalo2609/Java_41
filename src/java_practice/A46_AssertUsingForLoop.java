// Use assert concept in for loop
package java_practice;

public class A46_AssertUsingForLoop {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, -40, 50 };

		for (int i = 0; i < numbers.length; i++) {

			// assumption: all numbers must be positive
			assert numbers[i] > 0 : "Negative number found at index " + i;

			System.out.println(numbers[i]);
		}
	}
}