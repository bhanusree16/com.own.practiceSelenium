package timeouts;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
//		Thread.sleep(3000);
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				"withtimeout" wait for the webelement "ele"(i have mentioned like this in my code) to present on the page
				.withTimeout(Duration.ofSeconds(30))
//				"pollingEvery" checks what text is on the page for every 2 sec by default pollongtime is 250milliseconds
	            .pollingEvery(Duration.ofSeconds(2))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) 
		     {
		    	 WebElement ele = driver.findElement(By.id("demo"));
		    	 String value  = ele.getText();
		    	 if(value.equalsIgnoreCase("WebDriver"))
		    	 {
		    		 return ele;
		    	 }
		    	 else
		    	 {
		    		System.out.println(value);
		    		return null;
		    	 } 
		     }
		   });
		   System.out.println("element displayed" + element.isDisplayed());
		driver.quit();

	}

}
