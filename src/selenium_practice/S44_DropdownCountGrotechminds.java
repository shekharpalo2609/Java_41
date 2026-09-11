//How to count no. of options in the dropdown
package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S44_DropdownCountGrotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// 1. Write A Code To Select Demo2 Using Select By Visible Text.
		WebElement selectChoice1 = driver.findElement(By.id("Choice1"));
		Select demo2 = new Select(selectChoice1);
		demo2.selectByVisibleText("Demo2");
		List<WebElement> count = demo2.getOptions();
		System.out.println(count.size());
		Thread.sleep(1000);

		System.out.println("end");
	}

}
