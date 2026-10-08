package array.problems;
//Print only the common elements(same as A16_CommonElements)
import java.util.LinkedHashSet;
import java.util.Set;

public class A19_IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 5, 6, 7 };
		int arr2[] = { 1, 2, 4, 8, 7 };

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int num : arr1) {
			set.add(num);
		}
		for (int num : arr2) {
			if (set.contains(num)) {
				System.out.print(" " + num);
			}
		}
	}
}