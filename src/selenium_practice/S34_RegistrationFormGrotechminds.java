//Launch https://grotechminds.com/registeration-form/ and fill all the details
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S34_RegistrationFormGrotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement firstName = driver.findElement(By.cssSelector("#fname"));
		firstName.sendKeys("Shekhar");

		WebElement lastName = driver.findElement(By.cssSelector("#lname"));
		lastName.sendKeys("Palo");

		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("shekhar.palo123@gmail.com");

		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Password@123");

		WebElement maleGender = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
		maleGender.click();

		WebElement selectSkill = driver.findElement(By.id("Skills"));
		Select select1 = new Select(selectSkill);
		select1.selectByVisibleText("Technical Skills");
		
		WebElement selectCountry = driver.findElement(By.id("Country"));
		Select select2 = new Select(selectCountry);
		select2.selectByIndex(8);

		WebElement presentAddress = driver.findElement(By.id("Present-Address"));
		presentAddress.sendKeys("Mumbai");
		
		WebElement permanentAddress = driver.findElement(By.id("Permanent-Address"));
		permanentAddress.sendKeys("Mumbai");
		
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("40001");
		
		WebElement selectRelegion = driver.findElement(By.id("Relegion"));
		Select select3 = new Select(selectRelegion);
		select3.selectByIndex(1);
		
		WebElement chooseFileButton = driver.findElement(By.cssSelector("#file"));
		chooseFileButton.sendKeys("C:\\Users\\Shekhar\\Trade\\cheque axis1.png");
			
		Thread.sleep(2000);
		WebElement relocate = driver.findElement(By.cssSelector("label[for='relocate']"));
		relocate.click();

		Thread.sleep(2000);
		System.out.println("end");
	}

}