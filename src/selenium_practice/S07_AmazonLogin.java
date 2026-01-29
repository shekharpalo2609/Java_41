package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_AmazonLogin {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
   
		Thread.sleep(2000);

		WebElement emailMobile =  driver.findElement(By.id("ap_email_login"));
		emailMobile.sendKeys("shekhar123@gmail.com");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("fnjohfur");
		
		WebElement passwordButton = driver.findElement(By.id("signInSubmit"));
		passwordButton.click();
		//driver.findElement(By.name("login")).click();
		System.out.println("end");
	}

}
