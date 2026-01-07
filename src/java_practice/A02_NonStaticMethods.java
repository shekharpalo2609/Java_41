package java_practice;

public class A02_NonStaticMethods {

	void add() {
		int a = 4;
		int b = 16;
		System.out.println(a + b);
	}

	void sub() {
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
		A02_NonStaticMethods ns = new A02_NonStaticMethods();
		ns.add();
		ns.mul();
		ns.div();
		ns.sub();

	}

}
