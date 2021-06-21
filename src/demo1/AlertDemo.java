package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//LINE NO 11 is optional if we want to use testng lisners for classwise we can use this otherwise we can go for testng lisners as suite wise
@Listeners(library.TestNGLisners.class)
public class AlertDemo {
 
	@Test
	public void alertTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(3000);
		
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		Assert.assertEquals(alertText, "Please select start place.");
		driver.quit();
		

	}
	
	@Test
	public void test2()
	{
		System.out.println("failed case");
		Assert.assertTrue(false);
	}

}
