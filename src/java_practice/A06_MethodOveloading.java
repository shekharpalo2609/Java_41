package java_practice;

public class A06_MethodOveloading {

	public void add() {
		int a = 3;
		int b = 9;
		System.out.println(a + b);
	}

	public static void add(int a, int b) {
		a = 16;
		System.out.println(a);
	}

	public static void main(String[] args) {
		A06_MethodOveloading m1 = new A06_MethodOveloading();
		m1.add();
		A06_MethodOveloading.add(2, 9);

	}

}
