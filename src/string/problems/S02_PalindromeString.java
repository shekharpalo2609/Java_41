package string.problems;

public class S02_PalindromeString {

	public static void main(String[] args) {

		String str = "madam ada madam";
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("String is palindrome!");
		}
		else {
			System.out.println("String is not palindrome!");
		}
		System.out.println(rev);
	}

}
