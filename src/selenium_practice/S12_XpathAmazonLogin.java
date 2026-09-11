//Login to amazon using xpath(use id in attribute name and value)
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_XpathAmazonLogin {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement emailOrMobile = driver.findElement(By.xpath("//input[@id='ap_email_login']"));
		emailOrMobile.sendKeys("8097545793");

		WebElement continueButton = driver.findElement(By.xpath("//span[@id='continue']"));
		Thread.sleep(1000);
		continueButton.click();

		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("password@123");

		WebElement signIn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		Thread.sleep(1000);
		signIn.click();

		System.out.println("end");
	}

}
