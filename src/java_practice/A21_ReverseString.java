package java_practice;

//Reverse the string

public class A21_ReverseString {

	public static void main(String[] args) {
		String name = "shekhar";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			reverse = reverse + ch;
		}
		System.out.println("Original string: " + name);
		System.out.print("Reversed string: " + reverse);
	}

}
