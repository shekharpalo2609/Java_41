package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Navigate to Amazon.in and search iphone. Print all the recommended options
public class S49_PrintAutoSuggestions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone");

		List<WebElement> suggestions = driver
				.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		for (WebElement element : suggestions) {
			System.out.println(element.getText());
		}

	}

}
