package selenium_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S46_BrokenLinks {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			
			if(url == null || url.isEmpty()) {
				continue;
			}
			
			URI uri = new URI(url);
			
			HttpURLConnection connection = (HttpURLConnection)uri.toURL().openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			
			int responseCode = connection.getResponseCode();
			if(responseCode >= 400) {
				System.out.println("Broken link: " + url +" -> "+ responseCode);
			}
			else {
				System.out.println("valid link : " + url +" -> "+ responseCode);
			}
			connection.disconnect();
		}
		
		driver.quit();
	}
}
