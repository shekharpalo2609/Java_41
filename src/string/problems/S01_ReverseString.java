package string.problems;

public class S01_ReverseString {

	public static void main(String[] args) {

		String string = "reverse string";
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			char ch[] = string.toCharArray();
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}

}
