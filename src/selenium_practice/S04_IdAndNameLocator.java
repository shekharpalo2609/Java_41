package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class S04_IdAndNameLocator {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("shekhar123@gmail.com");
		driver.findElement(By.id("email")).sendKeys("shekhar@123");
		driver.findElement(By.name("login")).click();
		System.out.println("end");
	}

}
