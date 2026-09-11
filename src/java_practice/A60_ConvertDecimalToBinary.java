package java_practice;

public class A60_ConvertDecimalToBinary {

	public static void main(String[] args) {

		int decimal = 11;
		StringBuilder binary = new StringBuilder();
		while (decimal > 0) {
			int remainder = decimal % 2;
			binary.append(remainder);
			decimal = decimal / 2;
		}
		binary.reverse();
		System.out.println(binary);
	}

}
