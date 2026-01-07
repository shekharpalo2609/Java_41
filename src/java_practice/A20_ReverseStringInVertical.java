package java_practice;

//Print the String in vertical manner using for loop

public class A20_ReverseStringInVertical {

	public static void main(String[] args) {
		String name = "shekhar";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			System.out.println(ch);
		}
	}

}
