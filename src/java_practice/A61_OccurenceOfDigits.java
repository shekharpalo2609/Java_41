package java_practice;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to find the count of occurrences of each number in the following array:
{1, 2, 2, 4, 6, 7, 8, 8, 4, 0, 0, 4}
*/

public class A61_OccurenceOfDigits {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3,2, 4, 6, 7, 8, 8, 4, 0, 0, 4};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0) +1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}
}