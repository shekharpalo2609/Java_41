//Login to https://retail.onlinesbi.sbi/retail/login.htm where right click is disabled, use dummy id and password.
package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S30_TotalLinksInPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("Total links in google home page is: " + count);

		for (int i = 0; i < count; i++) {
			WebElement s1 = links.get(i);
			String linkText = s1.getText();
			String attribute = s1.getAttribute("href");
			System.out.println(linkText);
			System.out.println(attribute);
		}

	}

}
