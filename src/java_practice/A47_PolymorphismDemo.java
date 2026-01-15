package java_practice;

class PolyParent {
	public void show() {
		System.out.println("Parent method");
	}
}

public class A47_PolymorphismDemo extends PolyParent {

	public void show() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		PolyParent p = new A47_PolymorphismDemo();
		p.show();
	}
}