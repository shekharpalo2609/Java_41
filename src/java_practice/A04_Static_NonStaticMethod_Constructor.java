package java_practice;

//Create static, non-static and Constructor in a single class and call them in main(). create local variables

public class A04_Static_NonStaticMethod_Constructor {
	
	public A04_Static_NonStaticMethod_Constructor() {
		System.out.println("Constructor");
	}

	void add() {
		int a = 4;
		int b = 16;
		System.out.println(a + b);
	}

	static void sub() {
		int a = 22;
		int b = 16;
		System.out.println(a - b);
	}

	void mul() {
		int a = 2;
		int b = 16;
		System.out.println(a * b);
	}

	void div() {
		int a = 4;
		int b = 16;
		System.out.println(b / a);
	}
	
	public static void main(String[] args) {
		A04_Static_NonStaticMethod_Constructor ns = new A04_Static_NonStaticMethod_Constructor();
		ns.add();
		ns.div();
		ns.mul();
		sub();
	}

}
