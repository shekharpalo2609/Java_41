package array.problems;

import java.util.HashSet;
import java.util.Set;

public class A12_DuplicateElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 1, 5};
		Set<Integer> set = new HashSet<Integer>();
		System.out.println("Duplicate elements in array: ");
		for(int num : arr) {
			if(!(set.add(num))) {
				System.out.println(num);
			}
		}
	}
}
