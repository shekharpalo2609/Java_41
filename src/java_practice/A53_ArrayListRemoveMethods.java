//ArrayList remove methods
package java_practice;

import java.util.ArrayList;

public class A53_ArrayListRemoveMethods {
	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("a1-1");
		al1.add("a1-2");
		al1.add("a1-3");
		al1.add("a1-4");
		
		System.out.println(al1); 										//[a1-1, a1-2, a1-3, a1-4]
		
		//remove(int index)
		System.out.println(al1.remove(1)); 							//a1-2 
		
		//remove(Object i.e. value)
		al1.remove("a1-4");
		System.out.println(al1);										//[a1-1, a1-3]
		
		al1.removeAll(al1);
		System.out.println(al1); 										//[]
		
				
		
	}

}