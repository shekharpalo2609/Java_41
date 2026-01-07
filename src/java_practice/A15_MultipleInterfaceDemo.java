package java_practice;

/*Demo on Multiple inheritance(class A implements B,C)*/

interface GP{
	void gp1();
	void gp2();
}

interface P{
	void p1();
	void p2();
}

public class A15_MultipleInterfaceDemo implements GP,P{

	public static void main(String[] args) {
		A15_MultipleInterfaceDemo mi = new A15_MultipleInterfaceDemo();
		mi.p1();
		mi.p2();
		mi.gp1();
		mi.gp2();
	}

	public void p1() {
		System.out.println("P1");
	}

	public void p2() {
		System.out.println("P2");		
	}

	public void gp1() {
		System.out.println("GP1");		
	}

	public void gp2() {
		System.out.println("GP2");		
	}

}
