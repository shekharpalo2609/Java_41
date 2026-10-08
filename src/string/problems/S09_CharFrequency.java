package string.problems;

import java.util.HashMap;
import java.util.Map;

//String str = "String str = "aabbc";
/*
  	Output: 	
	a = 2
	b = 2
	c = 1
*/

public class S09_CharFrequency {
	public static void main(String[] args) {

		String str = "aabbc";
		char[] c = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : c) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		//System.out.println(map); this will also print the map but not in the required format
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}