package POM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author jagan
 * 
 * wordpress homepage locators
 *
 */

public class MyHomePage {
	WebDriver driver;
	By profile = By.xpath("(//*[@class='gravatar'])[1]");
	
	
	public MyHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void homePage()
	{
		driver.findElement(profile).click();
		System.out.println("profile clicked");	
	}

}
