//In amazon.in home page, click on 'All' dropdown and select options using all 3 methods: selectByValue(), selectByVisibleText(), selectByIndex()
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S13_DropdownSelectAmazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement all = driver.findElement(By.id("searchDropdownBox"));

		Select select = new Select(all);
		//select.selectByVisibleText("Baby");
		 select.selectByValue("search-alias=nowstore");
		//select.selectByIndex(5);
		System.out.println("end");
	}

}
