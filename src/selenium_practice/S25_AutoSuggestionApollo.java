//In any pharmacy application, handle auto suggestion
package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S25_AutoSuggestionApollo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.truemeds.in/order-online?utm_source=google&utm_medium=Search&utm_campaign=Sok_Performance_Max_1-9-22-New&adgroupid=&utm_term=&utm_adid={adid}&gad_source=1&gad_campaignid=21153413897&gbraid=0AAAAABfzGfhEG9VYos8eMB1TR3YyeUBxJ&gclid=EAIaIQobChMIj5nk3PG3kgMVAqNmAh2khRnNEAAYAiAAEgJd0_D_BwE");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.id("searchInput"));
		search.sendKeys("para");
		Thread.sleep(3000);
		

		List<WebElement> autoSugget = driver.findElements(By.xpath("//div[@class='sc-660b314d-0 eMHsqd']/div/div"));
		autoSugget.get(1).click();
		Thread.sleep(1000);
		System.out.println("end");

	}

}
