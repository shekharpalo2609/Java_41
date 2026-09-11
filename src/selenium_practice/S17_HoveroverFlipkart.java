//Launch flipkart.com, hoverover fashion and click on Men's T-shirt
package selenium_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S17_HoveroverFlipkart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(fashion).perform();
		Thread.sleep(1000);
		
		WebElement menTshirt = driver.findElement(By.linkText("Men's T-Shirts"));
		menTshirt.click();

		System.out.println("end");
	}

}
