//In the given string "My name is Java", split where the spaces are there

package java_practice;

import java.util.Arrays;

public class A42_SplitInString {

	public static void main(String[] args) {

		String name = "My name is Java";
		System.out.println(Arrays.toString(name.split(" ")));
	}
}