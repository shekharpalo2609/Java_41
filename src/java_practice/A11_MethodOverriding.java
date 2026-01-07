package java_practice;

class Parent {

	void parent1() {
		System.out.println("parent 1");
	}
	
	void parent2() {
		System.out.println("parent 2");
	}

}

public class A11_MethodOverriding extends Parent{

	void parent1() {
		System.out.println("child");
	}
	public static void main(String[] args) {
		A11_MethodOverriding a11 = new A11_MethodOverriding();
		a11.parent1(); 			//child
		a11.parent2();			//parent 2
		
	}
}
