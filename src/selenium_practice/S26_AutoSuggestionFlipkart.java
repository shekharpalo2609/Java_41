//In flipkart.com, search shoe and select 5th auto suggestion
package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S26_AutoSuggestionFlipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoe");
		Thread.sleep(5000);
		

		List<WebElement> autoSugget = driver.findElements(By.xpath("//form[@action='/search']/ul/li"));
		autoSugget.get(4).click();
		Thread.sleep(1000);
		System.out.println("end");

	}

}
