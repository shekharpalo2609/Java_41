package java_practice;

public class A18_ThisKeyword {

	String name;
	int age;
	String address;

	void details(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public static void main(String[] args) {
		A18_ThisKeyword k = new A18_ThisKeyword();
		k.details("Shekhar", 22, "Hyd");
		System.out.println("Student name is: " + k.name);
		System.out.println("Student age is: " + k.age);
		System.out.println("Student salary is: " + k.address);
	}

}
