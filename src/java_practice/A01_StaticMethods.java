package java_practice;

public class A01_StaticMethods {

	static void add() {
		int a = 4;
		int b = 16;
		System.out.println(a+b);
	}
	
	static void sub() {
		int a = 22;
		int b = 16;
		System.out.println(a-b);
	}
	
	static void mul() {
		int a = 2;
		int b = 16;
		System.out.println(a*b);
	}
	
	static void div() {
		int a = 4;
		int b = 16;
		System.out.println(b/a);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		
	}

}
