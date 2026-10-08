package array.problems;

public class A07_CountPositiveNegativeAndNon_Zero {

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, 0, 5, 6 };
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(int num:arr) {
			if(num > 0) {
				positive++;
				System.out.println(num + " is positive");
			}
			else if(num < 0){
				negative++;
				System.out.println(num + " is negative");
			}
			else if(num == 0){
				zero++;
				System.out.println(num + " is zero");
			}
		}
		System.out.println(positive +" even numbers in the array");
		System.out.println(negative +" odd numbers in the array");
		System.out.println(zero +" zero numbers in the array");
	}
}