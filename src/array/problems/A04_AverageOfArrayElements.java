package array.problems;

public class A04_AverageOfArrayElements {

	public static void main(String[] args) {

		int[] arr = { 2, 14, -5, -8, 12 };
		int sum = 0;
		int average = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		average = sum/arr.length;
		System.out.println(average);
	}

}
