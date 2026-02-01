//In amazon.in home page, click on All dropdown and click on Amazon Fresh using keys functionality.
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class S22_DropdownKeysAmazon {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement all = driver.findElement(By.id("searchDropdownBox"));
		all.sendKeys(Keys.DOWN);
		all.sendKeys(Keys.DOWN);
		all.sendKeys(Keys.DOWN);
		all.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		System.out.println("end");
	}

}
