/*Type casting -> Convert int data type to float data type */

package java_practice;

public class A51_TypeCastingDemo2 {

	public static void main(String[] args) {
		int age = 82;
		float floatAge = age;
		System.out.println(floatAge); // 82.0

		//create class A_51 and upcaste it to Object class
		Object obj = new A51_TypeCastingDemo2();
        System.out.println(obj.getClass().getName());

	}

}