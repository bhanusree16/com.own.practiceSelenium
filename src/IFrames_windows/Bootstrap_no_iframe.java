package IFrames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bootstrap_no_iframe {

	@Test
	public void window_popup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
		driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/input[1]")).sendKeys("bhanusree");
		Assert.assertNotNull(driver);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(3000);
//		driver.close();
	}
}
