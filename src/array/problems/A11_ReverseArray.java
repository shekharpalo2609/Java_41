package array.problems;

public class A11_ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int rev[] = new int[arr.length];
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			rev[index] = arr[i];
			index++;
		}
		for (int num : rev) {
			System.out.print(num + " ");
		}
	}

}
