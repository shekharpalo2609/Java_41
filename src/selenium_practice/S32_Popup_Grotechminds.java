//Launch https://grotechminds.com/javascript-popup/ and handle javascript pop-up
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S32_Popup_Grotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement clickButton = driver.findElement(By.className("btnjs"));
		clickButton.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("end");
	}

}