//Open google and click on gmail
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_LinkedTextTag {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
   
		Thread.sleep(2000);

		WebElement gmail =  driver.findElement(By.linkText("Gmail"));
		gmail.click();
		
		System.out.println("end");
	}

}
