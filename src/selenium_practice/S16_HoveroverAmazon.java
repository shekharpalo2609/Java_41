//Launch amazon.in and Hover over on Accounts&List and click on Sign in
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S16_HoveroverAmazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement accountsAndList = driver.findElement(By.partialLinkText("Account"));
		Actions actions = new Actions(driver);
		actions.moveToElement(accountsAndList).perform();
		Thread.sleep(1000);
		
		WebElement signIn = driver.findElement(By.xpath("//span[.='Sign in']"));
		signIn.click();

		System.out.println("end");
	}

}
