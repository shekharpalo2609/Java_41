package java_practice;

public class A58_MergeTwoArrays {

	public static void main(String[] args) {

		int arr1[] = {1,2,3,4};
		int arr2[] = {4,5,6,7};
		int merged[] = new int[arr1.length + arr2.length];
		int index = 0;
		
		for(int num: arr1) {
			merged[index] = num;
			index++;
		}
		for(int num : arr2) {
			merged[index] = num;
			index++;
		}
		for(int num : merged) {
			System.out.print(num + " ");
		}
	}	
}