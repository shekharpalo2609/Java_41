package webTable_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudentTable {

	private WebElement table;

	// constructor — every StudentTable object needs a driver to work with
	public StudentTable(WebDriver driver) {
		this.table = driver.findElement(By.id("studentsTable"));
	}

	// 1. Display those student names whose marks are greater than 50
	public List<String> getStudentNamesWhoseMarksAreGreaterThan50() {
		List<String> qualifiedStudent = new ArrayList<>();
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

	// 2. Find the student with highest marks
	public Map.Entry<String, Integer> studentWithHighestMarks() {
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

	// 3. Count no. of students from each city
	public Map<String, Integer> getStudentCountFromEachCity() {
		Map<String, Integer> map = new HashMap<>();
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String city = columns.get(2).getText();
			map.put(city, map.getOrDefault(city, 0) + 1);
		}
		return map;
	}

	// 4. Group student NAMES by City -> eg: Mumbai: [John, Mark]
	public Map<String, List<String>> getStudentsGroupedByCity() {
		Map<String, List<String>> map = new HashMap<>();
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			String city = columns.get(2).getText();
			String name = columns.get(0).getText();

			List<String> namesForCity = map.getOrDefault(city, new ArrayList<>());
			namesForCity.add(name);
			map.put(city, namesForCity);
		}
		return map;
	}
	
	//Fetch the records, print them and print the total number of rows in the table
	public void displayAllRecords() {
		List<List<String>> data = new ArrayList<>();
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(int i = 1; i< rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			List<String> rowData = new ArrayList<String>();
			for(WebElement column : columns) {
				rowData.add(column.getText());
			}
			data.add(rowData);
		}
		System.out.println("No. of rows: " +data.size());
		System.out.println(data);
	}
}