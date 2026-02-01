//Navigate to google and right click on Gmail
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S21_RightClickGoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		Thread.sleep(2000);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		actions.contextClick(gmail).perform();

		Thread.sleep(2000);
		driver.close();
		System.out.println("end");
	}

}
