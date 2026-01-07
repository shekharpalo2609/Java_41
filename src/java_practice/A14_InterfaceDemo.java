package java_practice;

/*2 interface with relation having 2 abstract methods in each and inherit those. 2 concrete methods in child class(one is static 
  	and another is non-static. call all these in main method*/

interface GrandParentInterface {
	
	void grandParent1();
	void grandParent2();
}

interface ParentInterface extends GrandParentInterface {
	
	void parent1();
	void parent2();
}

class ChildInterface implements ParentInterface{

	void childMethod1() {
		System.out.println("Non-static child method 1");
	}
	
	static void childMethod2() {
		System.out.println("Static child method 2");
	}
	
	public void grandParent1() {
		System.out.println("Grand Parent 1");
	}

	public void grandParent2() {
		System.out.println("Grand Parent 2");		
	}

	public void parent1() {
		System.out.println("Parent 1");		
	}

	public void parent2() {
		System.out.println("Parent 2");		
	}
	
}

public class A14_InterfaceDemo {

	public static void main(String[] args) {
		ChildInterface ci = new ChildInterface();
		ci.grandParent1();
		ci.grandParent2();
		ci.parent1();
		ci.parent2();
		ci.childMethod1();
		ChildInterface.childMethod2();
	}

}
