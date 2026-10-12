package selenium_practice;

import org.openqa.selenium.By;
//navigate to https://example.com/ and print the 1st paragraph in headless browser.
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S48_PrintParagrapInHeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://example.com/");
		System.out.println(driver.getTitle());
		
		String para1 = driver.findElement(By.xpath("//p[1]")).getText();
		System.out.println(para1);
		
	}
	
}
