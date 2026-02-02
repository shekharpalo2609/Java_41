
package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S28_CSS_Selectors {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//1. ID -> #idValue
		/*
		 * driver.get("https://www.google.com"); 
		 * 
		 * WebElement searchBox = driver.findElement(By.cssSelector("#APjFqb"));
		 * searchBox.sendKeys("India");
		 */
		
		//2. Class name -> .classNameValue
		/*
		 * driver.get("https://www.flipkart.com/");
		 * 
		 * WebElement searhBox = driver.findElement(By.cssSelector(".Pke_EE"));
		 * searhBox.sendKeys("shoe");
		 */
		
		//3. Tagname and ID -> tagName#idValue
		/*
		 * driver.get("https://www.google.com"); 
		 * 
		 * WebElement searchBox = driver.findElement(By.cssSelector("textarea#APjFqb"));
		 * searchBox.sendKeys("India");
		 */

		//4.Tagname and class name -> tagName.classNameValue
		/*
		 * driver.get("https://www.google.com"); 
		 * 
		 * WebElement searchBox = driver.findElement(By.cssSelector("textarea.gLFyf"));
		 * searchBox.sendKeys("India");
		 */
		
		//5. Attribute name and Attribute value -> [AN = ‘AV’] 
		/*
		 * driver.get("https://www.amazon.in/");
		 * 
		 * WebElement search =
		 * driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']"));
		 * search.sendKeys("mobile");
		 */

		//6. Tagname with Attribute name and Attribute value -> TN[AN = ‘AV’]
		/*
		 * driver.get("https://www.google.com"); WebElement searchBox =
		 * driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		 * searchBox.sendKeys("India");
		 */
		
		//7. Tagname, Class name, Attribute name and Attribute value -> TN.CN[AN = ‘AV’]
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.cssSelector("input.lNPl8b[name='q']"));
		search.sendKeys("electonics");
	}

}
