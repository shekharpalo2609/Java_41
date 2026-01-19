//Sort the ArrayList data in ascending order
package java_practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class A56_ArrayListSort {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(65);
		list.add(15);
		list.add(26);
		list.add(68);
		list.add(97);
		list.add(-654);

		Collections.sort(list);
		System.out.println(list);
	}

}