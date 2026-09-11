//WAP to fetch value from excel sheet(write all steps separately)
package selenium_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S43_DDTGrotechminds {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\java practice\\Java_41\\TestData\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		String firstNameCell = wb.getSheet("GTM").getRow(1).getCell(0).getStringCellValue();
		System.out.println(firstNameCell);

		String lastNameCell = wb.getSheet("GTM").getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastNameCell);

		String emailCell = wb.getSheet("GTM").getRow(1).getCell(2).getStringCellValue();
		System.out.println(emailCell);

		String phoneCell = NumberToTextConverter.toText(wb.getSheet("GTM").getRow(1).getCell(3).getNumericCellValue());
		System.out.println(phoneCell);

		String aadhaarCell = NumberToTextConverter.toText(wb.getSheet("GTM").getRow(1).getCell(4).getNumericCellValue());
		System.out.println(aadhaarCell);

		String panCell = wb.getSheet("GTM").getRow(1).getCell(5).getStringCellValue();
		System.out.println(panCell);

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");

		WebElement firstName = driver.findElement(By.cssSelector("#firstName"));
		firstName.sendKeys(firstNameCell);

		WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
		lastName.sendKeys(lastNameCell);

		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys(emailCell);

		WebElement phone = driver.findElement(By.cssSelector("#phone"));
		phone.sendKeys(phoneCell);

		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.name("gender"));
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Male");

		WebElement state = driver.findElement(By.name("state"));
		Select selectState = new Select(state);
		selectState.selectByValue("maharashtra");

		WebElement aadhaar = driver.findElement(By.cssSelector("#aadhaar"));
		aadhaar.sendKeys(aadhaarCell);

		WebElement pan = driver.findElement(By.cssSelector("#pan"));
		pan.sendKeys(panCell);
		Thread.sleep(2000);

		WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", checkBox);

		Thread.sleep(500);
		checkBox.click();
		WebElement register = driver.findElement(By.name("Submit"));
		register.click();
	}

}