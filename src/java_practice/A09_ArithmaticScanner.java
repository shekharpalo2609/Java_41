package java_practice;

import java.util.Scanner;

//create a class. add 5 methods -> add, subtract, divide, multiplication, modulus using Scanner class

public class A09_ArithmaticScanner {

	// add
	public static void add() {
		System.out.println("Addition:");
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		int sum = number1 + number2;
		System.out.println("Addition of both numbers: " + sum);
		sc.close();
	}

	// subtract
	public static void subtract() {
		System.out.println("Subtraction:");
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		int difference = number1 - number2;
		System.out.println("Subtraction of both numbers: " + difference);
		sc.close();
	}

	// multiply
	public static void multiply() {
		System.out.println("Multiplication:");
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		int multiplication = number1 * number2;
		System.out.println("Multiplication of both numbers: " + multiplication);
		sc.close();
	}

	// divide
	public static void divide() {
		System.out.println("Division:");
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		int division = number1 / number2;
		System.out.println("division of both numbers: " + division);
		sc.close();
	}

	// modulus
	public static void modulus() {
		System.out.println("Modulus:");
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		int modulus = number1 % number2;
		System.out.println("modulus of both numbers: " + modulus);
		sc.close();
	}

	public static void main(String[] args) {

		add();
		subtract();
		multiply();
		divide();
		modulus();
	}
}
