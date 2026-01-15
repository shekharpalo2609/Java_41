package java_practice;

import java.util.Arrays;

// Anagram means 2 strings should have exact number of characters
public class A35_AnagramString {
	public static void anagramMethod() {
		String name1 = "bread";
		String name2 = "beard";
		if(name1.length() == name2.length()) {
			char ch1[] = name1.toCharArray();
			char ch2[] = name2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.out.println("After sorting: " + Arrays.toString(ch1));
			System.out.println("After sorting: " + Arrays.toString(ch2));
			
		}
		else {
			System.out.println("Both the strings are not anagram !");
		}
		
		
	}
	public static void main(String[] args) {
		anagramMethod();
	}
}