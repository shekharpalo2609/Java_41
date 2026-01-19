//ArrayList add methods
package java_practice;

import java.util.ArrayList;

public class A52_ArrayListAddMethods {
	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		
		//use of add()
		al1.add("a1-1");
		al1.add("a1-2");
		al1.add("a1-3");
		al1.add("a1-4");

		System.out.println(al1); 							// [a1-1, a1-2, a1-3, a1-4]
		
		//use: add(index, value)
		al1.add(2, "al-2-2");
		System.out.println(al1); 							// [a1-1, a1-2, al-2-2, a1-3, a1-4]

		ArrayList<String> al2 = new ArrayList<String>();
		
		//addAll()
		System.out.println(al2.addAll(al1));				//true
		
		//addAll(index, Collection)
		al2.addAll(3, al1);
		System.out.println(al2); 							//[a1-1, a1-2, al-2-2, a1-1, a1-2, al-2-2, a1-3, a1-4, a1-3, a1-4]
		
		
	}

}