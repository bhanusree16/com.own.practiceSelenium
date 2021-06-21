package IFrames_windows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_popups {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		PAGELOADTIMEOUT is used for with in the given time the browser should load or it will throw an error and it should be before driver.get()
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@name='link1'][1]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent_window);
		driver.findElement(By.xpath("//a[@name='link1'][2]")).click();
		Thread.sleep(3000);	
		
		driver.switchTo().window(parent_window);
		driver.findElement(By.xpath("//a[@name='link1'][3]")).click();
		Thread.sleep(3000);
		
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allwindows);
		driver.switchTo().window(tabs.get(1));
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(2));
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(3));
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(parent_window);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
