//Which exception will come when you try to fetch mobile no. from excel sheet
package selenium_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class S42_DDTMobileNumber {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\java practice\\Java_41\\TestData\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String mobileCell = wb.getSheet("GTM").getRow(1).getCell(3).getStringCellValue();
		System.out.println(mobileCell);
		
		//java.lang.IllegalStateException
	}

}