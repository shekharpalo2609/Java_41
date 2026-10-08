package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class S03_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/") ;
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//1st method: using click()
		//driver.findElement(By.name("btnK")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");
		//2nd method: using keys functionality
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
