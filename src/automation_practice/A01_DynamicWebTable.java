package automation_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_DynamicWebTable {

	static WebElement table;
	static String filePath;
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		filePath = "file:///" + System.getProperty("user.dir") + "/src/test/resources/students-table_1.html";
		driver.get(filePath);
		table = driver.findElement(By.id("studentsTable"));

		List<String> result = getStudentNamesWhoseMarksAreGreaterThan50();
		System.out.println(result);

		Map.Entry<String, Integer> student = studentWithHighestMarks();
		System.out.println("Student with highest marks: " + student.getKey() + " with marks: " + student.getValue());
		System.out.println(student);

		Map<String, Integer> map = getStudentCountFromEachCity();
		System.out.println(map);
		
		System.out.println(getStudentsGroupedByCity());

	}

	// 1.Display those student names whose marks are greater than 50
	public static List<String> getStudentNamesWhoseMarksAreGreaterThan50() {
		List<String> qualifiedStudent = new ArrayList<String>();
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String studentName = columns.get(0).getText();
			int marks = Integer.parseInt(columns.get(1).getText());

			if (marks > 50) {
				qualifiedStudent.add(studentName);
			}
		}
		return qualifiedStudent;
	}

	// 2.Find the student with highest marks
	public static Map.Entry<String, Integer> studentWithHighestMarks() {

		String topName = null;
		int topMarks = -1;
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String studentName = columns.get(0).getText();
			int marks = Integer.parseInt(columns.get(1).getText());

			if (marks > topMarks) {
				topMarks = marks;
				topName = studentName;
			}
		}
		return Map.entry(topName, topMarks);
	}

	// 3.Count no. of students from each city
	public static Map<String, Integer> getStudentCountFromEachCity() {

		Map<String, Integer> map = new HashMap<String, Integer>();
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String city = columns.get(2).getText();
			map.put(city, map.getOrDefault(city, 0) + 1);
		}
		return map;
	}

	// 4. Group student NAMES by City (not just counts) -> eg: Mumbai: [John, Mark]
	public static Map<String, List<String>> getStudentsGroupedByCity() {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String city = columns.get(2).getText();
			String name = columns.get(0).getText();
			List<String> namesForCity = map.getOrDefault(city, new ArrayList<String>());
			namesForCity.add(name);
			map.put(city, namesForCity);
		}
		return map;
	}

}
