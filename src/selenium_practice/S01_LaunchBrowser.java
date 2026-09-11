package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01_LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/") ;
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
	}

}
