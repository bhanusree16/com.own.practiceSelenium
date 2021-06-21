package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); 
//		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
//		driver.findElement(By.className("button")).click();
		int count = driver.findElements(By.tagName("img")).size();
		System.out.println(count); 
		Thread.sleep(2000);
//		driver.quit();

	}

}
  