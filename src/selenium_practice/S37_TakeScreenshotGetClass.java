//Take screenshot and name the screenshot as class name
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

public class S37_TakeScreenshotGetClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		S37_TakeScreenshotGetClass ref = new S37_TakeScreenshotGetClass();
		String className = ref.toString();
		System.out.println(className);

		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");

		Thread.sleep(3000);

		List<WebElement> autoSugget = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		autoSugget.get(4).click();
		Thread.sleep(3000);

		TakesScreenshot screenshot = driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\HP\\OneDrive - HiWi Forex Transaction Services Pvt Ltd\\Pictures\\Screenshots\\" + className
						+ "automation.png");
		FileHandler.copy(source, destination);
		driver.close();

	}

}