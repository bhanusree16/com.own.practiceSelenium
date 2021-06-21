package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollintoClick {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn-automation.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,1500)");
		WebElement element=driver.findElement(By.xpath("(//*[@class='entry-title'])[5]"));
		js.executeScript("arguments[0].click()", element);
		System.out.println(element.getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
