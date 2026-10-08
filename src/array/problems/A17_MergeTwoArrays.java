package array.problems;

import java.util.ArrayList;
import java.util.List;

public class A17_MergeTwoArrays {
	public static void main(String[] args) {

		/*
		 * int arr1[] = { 1, 2, 3, 5, 6, 7 }; int arr2[] = { 1, 2, 4, 8, 7 }; int
		 * merged[] = new int[arr1.length + arr2.length]; int index = 0;
		 * 
		 * for(int num : arr1) { merged[index] = num; index++; } for(int num : arr2) {
		 * merged[index] = num; index++; } for(int num : merged) { System.out.print(num
		 * + " "); }
		 */

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> list = new ArrayList<Integer>();
		for (int num : arr1) {
			list.add(num);
		}
		for (int num : arr2) {
			list.add(num);
		}
		System.out.print(list + "");
	}
}