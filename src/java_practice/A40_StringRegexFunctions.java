/*In the String "Manish", check whether it starts from 'M'
In the same String "Manish", check whether it ends at 'h'
In the same String "Manish", check whether it has 5 letters
Check the last index of 'h' in the given String
 */
package java_practice;

public class A40_StringRegexFunctions {

	public static void main(String[] args) {

		String name = "Manish m";
		System.out.println("Starts with M: " + name.matches("^M.*"));
		System.out.println("Ends with h: " + name.matches(".*h$"));
		System.out.println("Has 5 letters: " + name.matches("[a-zA-Z]{5}"));
		System.out.println("Last index of h: " + name.lastIndexOf('h'));

	}
}