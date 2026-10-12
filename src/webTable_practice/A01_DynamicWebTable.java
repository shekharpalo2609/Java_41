package webTable_practice;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class A01_DynamicWebTable {

	public static void main(String[] args) {

		WebDriver driver = DriverManager.getDriver();
		driver.get(Config.getStudentsTableFilePath());

		StudentTableScenarios studentTable = new StudentTableScenarios(driver);

		List<String> result = studentTable.getStudentNamesWhoseMarksAreGreaterThan50();
		System.out.println(result);

		Map.Entry<String, Integer> student = studentTable.studentWithHighestMarks();
		System.out.println("Student with highest marks: " + student.getKey() + " with marks: " + student.getValue());

		Map<String, Integer> cityCounts = studentTable.getStudentCountFromEachCity();
		System.out.println(cityCounts);

		System.out.println(studentTable.getStudentsGroupedByCity());
		
		studentTable.displayAllRecords();

		DriverManager.quitDriver();
	}
}