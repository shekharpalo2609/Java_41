package java_practice;

//Abstract class(2 Parent class having 2 abstract methods and 1 concrete method each)
abstract class AbstractParent1 {

	abstract void parent1();

	abstract void parent2();

	void parent3() {
		System.out.println("parent 3");
	}
}

abstract class AbstractParent2 extends AbstractParent1 {

	abstract void parent4();

	abstract void parent5();

	void parent6() {
		System.out.println("parent 6");
	}
}

public class A13_AbstractDemo extends AbstractParent2 {

	public static void main(String[] args) {
		A13_AbstractDemo a13 = new A13_AbstractDemo();

		a13.parent1();
		a13.parent2();
		a13.parent4();
		a13.parent5();
		a13.parent6();
		a13.parent3();

	}

	void parent4() {
		System.out.println("parent 4");
	}

	void parent5() {
		System.out.println("parent 5");
	}

	void parent1() {
		System.out.println("parent 1");
	}

	void parent2() {
		System.out.println("parent 2");
	}
}
