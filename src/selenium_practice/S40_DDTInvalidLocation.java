//Which exception will come if provided wrong excel sheet location
package selenium_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S40_DDTInvalidLocation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("M:\\Users\\HP\\java practice\\Java_41\\TestData\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		// java.io.FileNotFoundException
	}

}