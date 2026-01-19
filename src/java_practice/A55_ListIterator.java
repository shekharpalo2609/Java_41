//Iterator example
package java_practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class A55_ListIterator {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(65);
		list.add(15);
		list.add(26);
		list.add(68);
		list.add(97);

		ListIterator<Integer> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------Reverse-----------");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}