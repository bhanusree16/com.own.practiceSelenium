package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)"); 		
//	OR	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
//		which is working only if the co-ordinates specified on the page is visible or else manually scroll the page down otherwise throwing the error 
//		so i used scroll upto the coordinates i want to , then it's working fine
		WebElement framename = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(framename);
		WebElement source = driver.findElement(By.id("draggable"));
		act.dragAndDropBy(source, 270, 130).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
