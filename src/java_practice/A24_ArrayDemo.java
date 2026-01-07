package java_practice;
/*
	Using Array and For loop, print the following output(A25_ArrayDemo.java):
			Student names		Roll No 	Gender
				ABC				  123		  M
			    DEF				  456		  M	
				PQR				  789		  F
*/

public class A24_ArrayDemo {

	public static void main(String[] args) {

		String[] names =new String[3];
		names[0] = "ABC";
		names[1] = "DEF";
		names[2] = "PQR";
		
		int[] roll_no =new int[3];
		roll_no[0] = 1;
		roll_no[1] = 2;
		roll_no[2] = 3;

		char[] gender = new char[3];
		gender[0] = 'M';
		gender[1] = 'M';
		gender[2] = 'F';
		
		System.out.println("Student_Name  Roll_number  Gender");
		
		for(int i = 0; i<=names.length-1; i++) {
			System.out.println(names[i] +"            "+ roll_no[i] + "             " + gender[i]);
		}
	}

}
