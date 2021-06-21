package POM_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * @author jagan
 * 
 * loginpage locaters
 *
 */
public class LoginPage {
	WebDriver driver;
	By username = By.xpath("//input[@class='form-text-input'][@type='text']");
	By continue_button = By.cssSelector("button[type='submit']");
	By password = By.cssSelector("#password");
	By submit_button = By.xpath("//*[@type='submit']");
	
	
	
	public LoginPage(WebDriver Driver)
	{
		this.driver = Driver;
		
	}
	
	public void loginpage(String user,String pass) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(username).sendKeys(user);
		driver.findElement(continue_button).click();
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit_button).click();
		Thread.sleep(5000);
		
	}

}
