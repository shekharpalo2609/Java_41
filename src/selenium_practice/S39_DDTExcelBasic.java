//WAP to fetch value from excel sheet(write all steps separately)
package selenium_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S39_DDTExcelBasic {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\java practice\\Java_41\\TestData\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("login1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}