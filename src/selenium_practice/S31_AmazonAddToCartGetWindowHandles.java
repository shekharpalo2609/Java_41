//In amazon, search shoe, click on 1st shoe and add it to cart
package selenium_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S31_AmazonAddToCartGetWindowHandles {

	@SuppressWarnings("unused")
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
		
		Set<String> set = driver.getWindowHandles();
		System.out.println("---"+set);
		Iterator <String> parentChildId = set.iterator();
		String parentId = parentChildId.next();
		String childId = parentChildId.next();
		
		driver.switchTo().window(childId);
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();

		System.out.println("end");

	}

}
