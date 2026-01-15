// Find the average of an array of int datatype whose size is 4
package java_practice;

public class A45_AverageOfTwoDifferentArrays {

	static double totalOfInt, totalOfDouble, average1, average2 ;
	public static void averageMethod() {
		int [] array1 = {66, 25, 84, 22};
		for(double d1 : array1) {
			totalOfInt = totalOfInt + d1;
			average1 = totalOfInt/array1.length;
		}
		System.out.println(average1);
		
		double [] array2 = {64.6, 34.8, 24.2, 75.1};
		for(double d2 : array2) {
			totalOfDouble = totalOfDouble + d2;
			average2 = totalOfDouble/array2.length;
		}
		System.out.println(average2);
		
		double average = (average1 + average2)/2;
		System.out.println(average);
	}

	public static void main(String[] args) {
		averageMethod();
	}
}