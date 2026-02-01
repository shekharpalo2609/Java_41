//Navigate to facebook registration page and select DOB, Month and Year dropdowns
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S14_DropdownSelectFacebook {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement date = driver.findElement(By.id("day"));
		Select select1 = new Select(date);
		select1.selectByIndex(5);
		
		WebElement month = driver.findElement(By.id("month"));
		Select select2 = new Select(month);
		select2.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		Select select3 = new Select(year);
		select3.selectByValue("2007");
		System.out.println("end");
	}

}
