package java_practice;

class GrandParents {

	public GrandParents() {
		System.out.println("grand parent non-parameterized constructor");
	}

	public GrandParents(String nane) {
		System.out.println("grand parent parameterized constructor");
	}

}

class Parents extends GrandParents {

	Parents() {
		System.out.println("parent non-parameterized constructor");
	}

	Parents(String name) {
		System.out.println("parent parameterized constructor");
	}
}

public class A16_SuperCallingStatement extends Parents {

	A16_SuperCallingStatement() {
		super("parent name");
		System.out.println("child non-parameterized constructor");
	}

	A16_SuperCallingStatement(String name) {
		System.out.println("child parameterized constructor");
	}

	public static void main(String[] args) {
		new A16_SuperCallingStatement();
		new A16_SuperCallingStatement("abc");

	}

}
