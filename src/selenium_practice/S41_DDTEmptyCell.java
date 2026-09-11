//What happen if you fetch value from an empty cell
package selenium_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S41_DDTEmptyCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\java practice\\Java_41\\TestData\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String cellValue = wb.getSheet("login").getRow(10).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		//  java.lang.NullPointerException
	}

}