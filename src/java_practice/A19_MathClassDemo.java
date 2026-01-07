package java_practice;

//using Math.random(), get the radius of 10 circles and find the area of each circle. for pi value, use Math.PI

public class A19_MathClassDemo {

	final static double pi = Math.PI;

	static void areaOfCircle() {
		for (int i = 1; i <= 10; i++) {
			double radius = Math.random();
			System.out.println("Area of a circle " + i + " is: " + 2 * pi * radius + " whose radius is " + radius);
		}
	}

	public static void main(String[] args) {

		System.out.println("Value of pie is: " + pi);
		areaOfCircle();
	}

}
