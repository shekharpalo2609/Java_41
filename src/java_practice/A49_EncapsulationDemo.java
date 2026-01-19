package java_practice;

public class A49_EncapsulationDemo extends PolyParent {

	private String name;
	private int age;
	private double salary;
	private String address = "Hyd";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		A49_EncapsulationDemo e = new A49_EncapsulationDemo();
		e.setAge(28);
		e.setName("Vikas");
		e.setSalary(60000);
		e.setAddress("Mumbai");
		
		System.out.println(e.name+" "+ e.address+" " + e.salary+ " "+e.age);
	}

}