//Navigate to https://grotechminds.com/dropdown/ and complete the dropdown instructions
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S15_DropdownSelectGrotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// 1. Write A Code To Select Demo2 Using Select By Visible Text.
		WebElement selectChoice1 = driver.findElement(By.id("Choice1"));
		Select demo2 = new Select(selectChoice1);
		demo2.selectByVisibleText("Demo2");
		Thread.sleep(1000);

		// 2. Write a code to select SQL 15 using select By Value.
		WebElement selectChoice2 = driver.findElement(By.id("Choice9"));
		Select sql15 = new Select(selectChoice2);
		sql15.selectByValue("SQL15");
		Thread.sleep(1000);

		// 3. Explain the procedure of Selecting Night 10 dropdown?
		WebElement selectChoice6 = driver.findElement(By.id("Choice6"));
		Select night10 = new Select(selectChoice6);
		night10.selectByIndex(10);
		Thread.sleep(1000);

		// 4. Write codes separately to select QTP 10(choice 8) and Energy 15(choice 4) using Select by Visible Text.
		WebElement choice8 = driver.findElement(By.id("Choice8"));
		Select selectQtp = new Select(choice8);
		selectQtp.selectByVisibleText("QTP10");
		Thread.sleep(1000);

		WebElement choice4 = driver.findElement(By.id("Choice4"));
		Select selectEnergy = new Select(choice4);
		selectEnergy.selectByVisibleText("Energy15");
		Thread.sleep(1000);

		// 5. Write codes separately to select QTP 9 and Energy 14 using Select by Visible Text.
		selectQtp.selectByVisibleText("QTP9");
		Thread.sleep(1000);

		selectEnergy.selectByVisibleText("Energy14");
		Thread.sleep(1000);

		// 6. Write codes separately to select QTP 8 and Energy 13 using Select by Visible Text.
		selectQtp.selectByVisibleText("QTP8");
		Thread.sleep(1000);

		selectEnergy.selectByVisibleText("Energy13");
		Thread.sleep(1000);

		// 7. Write codes separately to select QTP 7 and Energy 12 using Select by Visible Text.
		selectQtp.selectByVisibleText("QTP7");
		Thread.sleep(1000);

		selectEnergy.selectByVisibleText("Energy12");
		Thread.sleep(1000);

		// 8. Write codes separately to select QTP 6 and Energy 11 using Select by Visible Text.
		selectQtp.selectByVisibleText("QTP6");
		Thread.sleep(1000);

		selectEnergy.selectByVisibleText("Energy11");
		Thread.sleep(1000);

		System.out.println("end");
	}

}
