package webTable_practice;

public class Config {

	// centralized configuration — change this ONE place if the file location ever moves
	public static String getStudentsTableFilePath() {
		return "file:///" + System.getProperty("user.dir") + "/src/test/resources/students-table_1.html";
	}
}