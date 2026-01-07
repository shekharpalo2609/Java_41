package java_practice;

public class A03_StaticAndNonStaticMethods {

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
		A03_StaticAndNonStaticMethods ns = new A03_StaticAndNonStaticMethods();
		ns.add();
		ns.div();
		ns.mul();
		sub();
	}

}
