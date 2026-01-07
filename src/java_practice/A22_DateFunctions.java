/*
print output Date below format              
1)16 Apr 2024 
2) 16-Apr-2024
3) 16/Apr/2024
*/

package java_practice;

import java.util.Date;

public class A22_DateFunctions {

	// static String date;
	// static String month;
	// static String year;

	static void dateFunctions() {

		Date d = new Date();
		System.out.println(d);

		String dateInString = d.toString();

		String date = dateInString.substring(8, 10);
		System.out.println("Current date is: " + date);

		String month = dateInString.substring(4, 7);
		System.out.println("Current month is: " + month);

		String year = dateInString.substring(dateInString.length() - 4);
		System.out.println("Current year is: " + year);

		// 1)16 Apr 2024
		String firstFormat = date + " " + month + " " + year;
		System.out.println(firstFormat);

		// 2)16-Apr-2024
		String secondFormat = date + "-" + month + "-" + year;
		System.out.println(secondFormat);

		// 3)16/Apr/2024
		String thirdFormat = date + "/" + month + "/" + year;
		System.out.println(thirdFormat);

	}

	public static void main(String[] args) {

		dateFunctions();

	}

}
