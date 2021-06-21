package IFrames_windows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemo {
	@Test
	public void IframeFunction() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\eclipse\\javaJars\\iframe_HTML\\myframes.html");
//		by taking iframe name or id by switchto method i m going into iframe 
		driver.switchTo().frame("selenium");
//		handling operations in iframe
		driver.findElement(By.id("genesis-mobile-nav-primary")).click(); 
		Thread.sleep(2000);
//		 and cursor will come back to main page
		driver.switchTo().defaultContent();
//		to know number of iframes
		int count= driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
//		if we cant find by id or name of iframe then first we store it as webelement by taking xpath or css and then swith to the frame
		WebElement my_frame = driver.findElement(By.xpath("//iframe[@title='selenium tutorial']"));
		driver.switchTo().frame(my_frame);
		driver.findElement(By.cssSelector("#dropdownButton")).click();
		List<WebElement> text= driver.findElements(By.xpath("//*[@id=\"navbar\"]/a"));
		Thread.sleep(2000);
		for(WebElement value:text)
		{
			String title = value.getText();
			if(title.equals("Projects"))
			{
				value.click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Click here for selenium tutorial ']")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
