package array.problems;

/*Given an array of integers, return the index of the first occurrence of a given element in the array. 
If the element is found, print the index of that element. Print all the indexes if element is present at 
multiple positions. 
If the element is not found, print "element not found."*/

public class A20_IndexOfSearchedElement {

	public static void main(String[] args) {
		int arr[] = {33,45,21,18,45,48,39};
		int check = 45;
		boolean isPresent = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == check) {
				System.out.print("45 is present at index position: "+ i);
				isPresent = true;
			}
		}
		if(!isPresent) {
            System.out.println("Element not found");
		}
			
	}

}
