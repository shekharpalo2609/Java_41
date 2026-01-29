package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_IdAndNameLocator_FacebookRegister {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		driver.findElement(By.name("firstname")).sendKeys("FNAME");
		
	}

}
