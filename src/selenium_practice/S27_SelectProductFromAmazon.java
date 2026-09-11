//Without login to amazon, search shoe and select the 1st shoe in the result page
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S27_SelectProductFromAmazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement firstShoe = driver.findElement(By.xpath("(//div[@role='listitem'])[1]"));
		firstShoe.click();

		System.out.println("end");

	}

}
