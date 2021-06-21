package brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Http_connect;


 
public class BrokenLinkDemo {
	@Test
	public void count_link() {
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Javaprojects\\practiceSelenium\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement values:links)
		{
			String url=values.getAttribute("href");
			Http_connect.verifyUrl(url);
		}
		driver.quit();
	}
	
	public static void verifyUrl(String urlLink)
		{
			try {
				URL	MY_url = new URL(urlLink);
				HttpURLConnection Httpconnect = (HttpURLConnection)MY_url.openConnection();
				Httpconnect.connect();
				
				if(Httpconnect.getResponseCode()==200)
		           {
		          System.out.println("ok");
		            }
		          if(Httpconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
		           {
		               System.out.println("no");
		            }
				
			} catch (Exception e) {
				
				
			}
			 
			
		}

}




	

