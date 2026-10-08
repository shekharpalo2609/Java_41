package java_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A64_SecondMostRepeatingCharacterInString {

	public static void main(String[] args) {
		String str = "java";
		System.out.println(findSecondMostRepeated(str));

	}

	public static Character findSecondMostRepeated(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (!(ch == ' ')) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
		}
		List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
		sortedList.sort(Comparator.comparing(Map.Entry<Character, Integer>::getValue).reversed());

		int highest = sortedList.get(0).getValue();
		for (Map.Entry<Character, Integer> entry : sortedList) {
			if (entry.getValue() < highest) {
				return entry.getKey();
			}
		}
		return null;
	}

}
