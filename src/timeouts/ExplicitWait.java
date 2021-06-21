package timeouts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		i can use implicit wait also for this
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//p[text()='WebDriver']"))));
		System.out.println(element.getText());
		if(element.isDisplayed())
		{
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("webelement loaded but not displayed");
		}
		driver.quit();

	}

}
