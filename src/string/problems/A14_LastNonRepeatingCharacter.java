package string.problems;

import java.util.*;
import java.util.Map;

public class A14_LastNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aabbcddeffedfghtrkjhg";
		System.out.println(findLastNonRepeatingCharacter(str));
	}

	public static char findLastNonRepeatingCharacter(String str) {
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(char ch : str.toLowerCase().toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		Character result = null;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				
				result = entry.getKey();
			}
		}
		return result;
	}
}