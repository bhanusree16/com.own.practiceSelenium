package timeouts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		IF use implicit wait it waits for particular webelement tobe find in that time period and it is applicable for all webelements in the script
//		incase it coudnot find webelement it throws nosuchelement exception
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("selenium");
		driver.findElement(By.id("identifierNext")).click();

	}

}
