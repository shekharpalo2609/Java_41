// Go to amazon.in and search shoe using relative xpath
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11_XpathAmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		search.sendKeys("shoe");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		System.out.println("end");
	}

}
