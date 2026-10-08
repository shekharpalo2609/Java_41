package string.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S11_SecondMostRepeatedChar {

	public static void main(String[] args) {
		String str = "aabbbccdeee";
		System.out.println(findSecondMostRepeatedCharacter(str));
	}

	public static Character findSecondMostRepeatedCharacter(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
		sortedList.sort(Comparator.comparing(Map.Entry<Character, Integer>::getValue).reversed());

		int highestFreq = sortedList.get(0).getValue();
		for (Map.Entry<Character, Integer> entry : sortedList) {
			if (entry.getValue() < highestFreq) {
				return entry.getKey();
			}
		}
		return null;
	}
}