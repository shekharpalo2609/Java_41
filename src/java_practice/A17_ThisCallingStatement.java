package java_practice;

public class A17_ThisCallingStatement {

	A17_ThisCallingStatement() {
		this(45, "sas");
		System.out.println("constructor 1");
	}

	A17_ThisCallingStatement(String name) {
		this("sas", 87.7);
		System.out.println("constructor 2");
	}

	A17_ThisCallingStatement(String name, double d) {

		System.out.println("constructor 3");
	}

	A17_ThisCallingStatement(int i, String name) {
		this("sas");
		System.out.println("constructor 4");
	}

	public static void main(String[] args) {
		new A17_ThisCallingStatement();

	}

}
