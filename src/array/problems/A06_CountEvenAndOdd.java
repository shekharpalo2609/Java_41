package array.problems;

public class A06_CountEvenAndOdd {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int even = 0;
		int odd = 0;
		for(int num:arr) {
			if(num % 2 == 0) {
				even++;
				System.out.println(num + " is even");
			}
			else {
				odd++;
				System.out.println(num + " is odd");
			}
		}
		System.out.println(even +" even numbers in the array");
		System.out.println(odd +" odd numbers in the array");
	}
}