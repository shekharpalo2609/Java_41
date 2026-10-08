package array.problems;
//Print all the elements only once in a single array
import java.util.HashSet;
import java.util.Set;

public class A18_UnionOfTwoArrays {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 5, 6, 7 };
		int arr2[] = { 1, 2, 4, 8, 7 };

		Set<Integer> set = new HashSet<Integer>();
		for (int num : arr1) {
			set.add(num);
		}
		for (int num : arr2) {
			set.add(num);
		}
		System.out.println(set);

	}
}