package string.problems;

public class S03_CountConsonantsAndVowels {

	public static void main(String[] args) {

		String str = "count vowels and consonants!!@as";
		int vowels = 0;
		int consonants = 0;
		for (char ch : str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else if (Character.isLetter(ch)) {
				consonants++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonants);
	}

}
