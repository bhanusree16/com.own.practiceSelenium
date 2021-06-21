package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.Highlighthelper;

public class ElementHighlight {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement username =driver.findElement(By.id("email"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Highlighthelper.highligher(driver, username);
//		username.sendKeys("bhanu12345");
		
//		for sending text to the textfield without sendkeys option ...i m using javascriptexecutor to send input to the textfield

//		js.executeScript("arguments[0].value='bhanu12345'", username);
		js.executeScript("document.getElementById('email').value='bhanu12345'");

		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("pass"));
		Highlighthelper.highligher(driver, password);
		password.sendKeys("sree123");
		
		WebElement click = driver.findElement(By.name("login"));
		Highlighthelper.highligher(driver, click);
		click.click();
		driver.quit();
		

	}

}
