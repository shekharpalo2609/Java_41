//Iterator example
package java_practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A54_Iterator {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(25);
		set.add(65);
		set.add(51);
		set.add(93);
		set.add(40);

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}