//Launch google.com, type India and select 5th auto suggestion

package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S23_AutoSuggestionGoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");

		Thread.sleep(3000);

		List<WebElement> autoSugget = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		autoSugget.get(4).click();
		Thread.sleep(1000);
		System.out.println("end");

		}

}
