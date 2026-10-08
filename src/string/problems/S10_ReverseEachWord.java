package string.problems;

/*	String str = "Java Selenium";
  	Output: avaJ muineleS	
*/

public class S10_ReverseEachWord {
	public static void main(String[] args) {

		String str = "Java Selenium";
		String[] words = str.split(" ");
		String rev = "";

		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				rev = rev + words[i].charAt(j);
			}
			if (i < words.length - 1) {
				rev = rev + " ";
			}
		}
		System.out.println(rev);
	}
}