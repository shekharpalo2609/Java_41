//Navigate to https://grotechminds.com/drag-and-drop/ and perform 8 actions mentioned there
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S20_DragAndDropGrotechminds {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement destination = driver.findElement(By.xpath("(//div[@class='w3-container '])[2]"));
		Thread.sleep(2000);

		//1. Write a code to drag and drop JSON              
		WebElement json = driver.findElement(By.xpath("//div[@id='container-10']"));
		actions.dragAndDrop(json,destination).perform();
		Thread.sleep(1000);
		actions.dragAndDrop(destination,json).perform();
		
		//2. Write a code to return GitHub to original position after drag and drop              
		WebElement gitHub = driver.findElement(By.xpath("//div[@id='container-4']"));
		actions.dragAndDrop(gitHub,destination).perform();
		Thread.sleep(1000);
		actions.dragAndDrop(destination,gitHub).perform();
				
		//3 Write a code to drag and drop Selenium                
		WebElement selenium = driver.findElement(By.xpath("//div[@id='container-5']"));
		actions.dragAndDrop(selenium,destination).perform();
		Thread.sleep(1000);
		actions.dragAndDrop(destination,selenium).perform();
		
		Thread.sleep(2000);
		driver.close();
		System.out.println("end");
	}

}
