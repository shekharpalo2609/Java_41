package java_practice;

//flow of execution in SIB, IIB, main() and constructor

public class A10_BlocksInJava {

	// instance block
	{
		System.out.println("instance block 1");
	}
	
	static {
		System.out.println("static block 1");
	}
	
	public A10_BlocksInJava() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("main");
		new A10_BlocksInJava();
		new A10_BlocksInJava();
	}
}
