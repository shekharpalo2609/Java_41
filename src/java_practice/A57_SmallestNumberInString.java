package java_practice;

public class A57_SmallestNumberInString {

	public static void main(String[] args) {

		String str = "abc-12def34gh-56ij78kl9";
		int min = 9;
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				int num = ch-'0';
				if (num < min) {
					min = num;
				}
			}
		}
		System.out.println(min);
	}
}