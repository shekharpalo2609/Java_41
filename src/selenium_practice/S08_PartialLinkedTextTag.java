//Open google and click on gmail
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S08_PartialLinkedTextTag {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
   
		Thread.sleep(2000);

		WebElement bestSeller =  driver.findElement(By.partialLinkText("Best"));
		bestSeller.click();
		
		System.out.println("end");
	}

}
