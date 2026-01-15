// Find the average of an array of int datatype whose size is 4
package java_practice;

public class A44_AverageOfArray {

	static double total, average ;
	public static void averageMethod() {
		int [] array = {66, 25, 84, 22};
		for(double d : array) {
			total = total + d;
			average = total/array.length;
		}
		System.out.println(average);
	}

	public static void main(String[] args) {
		averageMethod();
	}
}