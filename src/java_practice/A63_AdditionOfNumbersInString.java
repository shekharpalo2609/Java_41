package java_practice;

public class A63_AdditionOfNumbersInString {

	public static void main(String[] args) {
		String str = "abc123xyz45";
		int  sum = 0;

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
}