package java_practice;

//Constructor overloading(make 1 constructor with 7 parameter)

@SuppressWarnings("unused")
public class A05_ConstructorOveloading {

	public A05_ConstructorOveloading() {
		System.out.println("Default Constructor");
	}

	public A05_ConstructorOveloading(int a) {
		System.out.println("1 parameter constructor");
	}

	public A05_ConstructorOveloading(int a, int b) {
		System.out.println("2 parameter constructor");
	}

	public A05_ConstructorOveloading(int a, int e, String c, double d, long l, float f, byte b) {
		System.out.println("7 parameter constructor");
	}

	public static void main(String[] args) {
		A05_ConstructorOveloading ns1 = new A05_ConstructorOveloading();
		A05_ConstructorOveloading ns2 = new A05_ConstructorOveloading(8);
		A05_ConstructorOveloading ns3 = new A05_ConstructorOveloading(0,13);
		A05_ConstructorOveloading ns4 = new A05_ConstructorOveloading(17, 12, "test", 56, 88, 768, (byte) 1);
		
		
	}

}
