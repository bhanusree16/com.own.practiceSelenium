package screenshot;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;
@Test
public class Screenshotdemo {

		public void main() throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		Utility.screenhshotlibrary(driver, "mainPage");
		driver.findElement(By.id("email")).sendKeys("smilybhanu");
		Thread.sleep(2000);
		Utility.screenhshotlibrary(driver, "signPage");
		
		driver.quit();

	}

}
