/*Type casting -> Byte age = 82; convert this into long data type and update the long datatype to 1000. 
	Also do the reverse(long = 1000; convert it into byte)*/

package java_practice;

public class A50_TypeCastingDemo1 {

	public static void main(String[] args) {
		byte age = 82;
		long longAge = age;
		System.out.println(longAge);
		
		long longValue = 1000;
		byte byteValue = (byte) longValue;
		System.out.println(byteValue); 					//-24
	}

}