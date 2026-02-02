//Take screenshot and store it at invalid location
package selenium_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S38_TakeScreenshotInvalidLocation {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");

		Thread.sleep(3000);

		TakesScreenshot screenshot = driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("R:\\Pictures\\Screenshots\\" + "automation.png");		// java.io.FileNotFoundException:
		FileHandler.copy(source, destination);
		driver.close();

	}

}