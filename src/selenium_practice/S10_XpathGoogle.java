//Write relative xpath for Google search
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10_XpathGoogle {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement search = driver.findElement(By.xpath("(//textarea)[1]"));
		search.click();

		System.out.println("end");
	}

}
