package java_practice;

public class A58_SmallestAndSecondSmallestNumberInString {

	public static void main(String[] args) {
		String str = "abc-12def34gh-56ij78kl9";
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(char ch : str.toCharArray()) {
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if(num < smallest) {
					secondSmallest = smallest;
					smallest = num;
				}if(num < secondSmallest && num != smallest) {
					secondSmallest = num;
				}
			}
		}
		System.out.println(smallest);
		System.out.println(secondSmallest);
	}

}
