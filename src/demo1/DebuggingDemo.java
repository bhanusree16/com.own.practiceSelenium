package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebuggingDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//*[text()='Documentation'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		} 

	

}
