//Use all 4 navigate methods of selenium driver: back(), forward(), refresh(), to(“----”)
package selenium_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class S45_DriverNavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/dropdown/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();

		System.out.println("end");
	}

}
