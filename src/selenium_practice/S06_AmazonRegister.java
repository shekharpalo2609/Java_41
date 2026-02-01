//Register yourself on amazon(dummy values)
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_AmazonRegister {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&showRememberMe=true&openid.pape.max_auth_age=900&pageId=inflex&prepopulatedLoginId=&openid.assoc_handle=inflex&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&policy_handle=Retail-Checkout");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("ap_phone_number")).sendKeys("shekhar123@mail.com");
		/*
		 * driver.findElement(By.className("a-button-input")).click();
		 * driver.findElement(By.name("lastname")).sendKeys("palo");
		 * driver.findElement(By.name("reg_email__")).sendKeys("9934720621");
		 * driver.findElement(By.id("password_step_input")).sendKeys("shekhar123");
		 */System.out.println("end");
	}

}
