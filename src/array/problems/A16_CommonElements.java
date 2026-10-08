package array.problems;

import java.util.HashSet;
import java.util.Set;

public class A16_CommonElements {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 5, 6, 7 };
		int arr2[] = { 1, 2, 4, 8, 7 };

		Set<Integer> set = new HashSet<Integer>();
		for (int num : arr1) {
			set.add(num);
		}
		for (int num : arr2) {
			if (set.contains(num)) {
				System.out.print(num + " ");
			}
		}
	}
}