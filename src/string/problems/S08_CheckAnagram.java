package string.problems;

import java.util.Arrays;

//str1 = listen
//str2 = silent
//output -> Anagram
public class S08_CheckAnagram {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";

		if (!(str1.length() == str2.length())) {
			System.out.println("Not anagram");
		} else {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		}

	}

}
