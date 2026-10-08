package array.problems;

public class A03_SumOfArrayElements {

	public static void main(String[] args) {

		/*
		 * int[] arr = { 2, 14, -5, -19, 12 }; int sum = 0; for (int i = 0; i <
		 * arr.length; i++) { sum = sum + arr[i]; } System.out.println(sum);
		 */
		int arr[] = {4, 5, 77, 12, 9,-4};
		int sum = 0;
		for(int number : arr){
		    sum += number;
		}
		System.out.println(sum);
	}

}
