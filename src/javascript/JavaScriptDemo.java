package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement login_name=driver.findElement(By.id("login-username"));
		js.executeScript("arguments[0].value='bhanu1234'",login_name );
//		i can send keys both the ways as line no 17  or line no 19
//		js.executeScript("arguments[0].value=arguments[1]", login_name,"bhanu1235");
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.id("persistent"));
		js.executeScript("arguments[0].click()",checkbox);
		Thread.sleep(3000);
		driver.quit();

	}

}
