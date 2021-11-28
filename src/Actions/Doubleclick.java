package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/");
//		first you need to create actions class object then perform operations
		Actions act=new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(element);
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
		Thread.sleep(2000);
		driver.quit();
//		comment

	}

}
