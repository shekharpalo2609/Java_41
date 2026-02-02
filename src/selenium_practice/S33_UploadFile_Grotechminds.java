//Launch https://grotechminds.com/registration/ and upload file
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S33_UploadFile_Grotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement chooseFileButton = driver.findElement(By.cssSelector("#file"));
		chooseFileButton.sendKeys("C:\\Users\\Shekhar\\Trade\\cheque axis1.png");
		
		Thread.sleep(2000);
		System.out.println("end");
	}

}