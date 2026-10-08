package string.problems;

import java.util.HashSet;
import java.util.Set;

public class S13_CheckWhetherAllChaactersArePresentInString {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		Set<Character> set = new HashSet<Character>();
		for(char ch : str.toLowerCase().toCharArray()){
			if(!(ch == ' ')) {
				set.add(ch);
			}
		}
		if(set.size() == 26) {
			System.out.println("All alphabets are present");
		}
		else {
			System.out.println("Some alphabets are missing");
		}
		System.out.println(set.size());
		System.out.println(set);
	}

}
