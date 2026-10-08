package array.problems;

public class A02_FindSmallestElement {

	public static void main(String[] args) {

		int[] arr = { 2, 4, -5, -19, 8 };
		int min = arr[0];
		
		for(int num : arr) {
			if(num < min) {
				min  = num;
			}
		}
		System.out.println(min + " is the smallest element");

	}

}
