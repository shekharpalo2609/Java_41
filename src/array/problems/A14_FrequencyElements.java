package array.problems;
import java.util.HashMap;

public class A14_FrequencyElements {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 1, 5 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(map, 0) + 1);
		}
		System.out.println(map);
	}
}
