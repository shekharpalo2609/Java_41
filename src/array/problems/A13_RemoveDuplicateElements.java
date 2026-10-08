package array.problems;

import java.util.HashSet;
import java.util.Set;

public class A13_RemoveDuplicateElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 1, 5};
		Set<Integer> set = new HashSet<Integer>();
		for(int num : arr) {
			set.add(num);
		}
		System.out.println(set);
	}
}
