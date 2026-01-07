package java_practice;

class Parent1 {

	void parent1() {
		System.out.println("parent 1");
	}
	
	void parent2() {
		System.out.println("parent 2");
	}

}

public class A12_MethodOverridingSuperKeyword extends Parent{

	void parent1() {
		System.out.println("child");
		super.parent1();
	}
	public static void main(String[] args) {
		A12_MethodOverridingSuperKeyword a12 = new A12_MethodOverridingSuperKeyword();
		a12.parent1(); 			//child  parent 1
		a12.parent2();			//parent 2
		
	}
}
