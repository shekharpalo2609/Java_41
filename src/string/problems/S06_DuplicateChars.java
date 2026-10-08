package string.problems;

import java.util.HashMap;
import java.util.Map;

//String str = "PrograMming";
/*Output: 	r
			g
			m*/

public class S06_DuplicateChars {
	public static void main(String[] args) {

		String str = "PrograMming";
		char ch[] = str.toLowerCase().toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}