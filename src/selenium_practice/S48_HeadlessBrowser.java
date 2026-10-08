package selenium_practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S48_HeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
}
