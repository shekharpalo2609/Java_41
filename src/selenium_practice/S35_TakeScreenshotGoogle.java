//Launch google, type India, take a screenshot
package selenium_practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S35_TakeScreenshotGoogle {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");

		Thread.sleep(3000);

		List<WebElement> autoSugget = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		autoSugget.get(4).click();
		Thread.sleep(3000);

		TakesScreenshot screenshot = driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\HP\\OneDrive - HiWi Forex Transaction Services Pvt Ltd\\Pictures\\Screenshots\\googlePic.png");
		FileHandler.copy(source, destination);

	}

}