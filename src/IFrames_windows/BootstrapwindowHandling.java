package IFrames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapwindowHandling {
@Test
	public void loginPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(5000);
		WebElement framename= driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(framename);
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9000246532");
//		inorder to close and go back to main page first switchto the default content and take the iframe's close button xpath
//		1
		driver.switchTo().defaultContent();
//		2
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div[2]/i")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
