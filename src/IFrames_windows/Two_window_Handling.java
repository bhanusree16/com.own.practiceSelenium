package IFrames_windows;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Two_window_Handling {
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@name='link1'][1]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String child_window:allwindows)
		{
			if(!parent_window.equals(child_window))
			{
				driver.switchTo().window(child_window);
				Thread.sleep(3000);
//				driver.findElement(By.xpath("//a[@name='link1'][2]")).click();
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
				driver.close();
			}
		}
		driver.switchTo().window(parent_window);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
