//open FB and register(First name, last name, mobile number, password and click on Sign up) -> Use id and name locator only
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_IdAndNameLocatorFacebook {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("shekhar");
		driver.findElement(By.name("lastname")).sendKeys("palo");
		driver.findElement(By.name("reg_email__")).sendKeys("9934720621");
		driver.findElement(By.id("password_step_input")).sendKeys("shekhar123");
		driver.findElement(By.name("websubmit")).click();
		System.out.println("end");
	}

}
