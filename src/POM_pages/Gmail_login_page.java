package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Gmail_login_page {
	
	WebDriver driver;
	
	public Gmail_login_page(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	@FindBy(id="identifierId") WebElement email_or_phone;
//	@FindBy(how=How.CLASS_NAME,using="VfPpkd-RLmnJb") WebElement next_button;
	@FindBy(xpath="(//*[@class='VfPpkd-vQzf8d'])[1]") WebElement next_button;
	@FindBy(xpath="//*[text()='Forgot email?']") WebElement Forgot_Button;
	
	
	
	
	public void login_page_locators(String username)
	{
		email_or_phone.sendKeys(username);
		next_button.click();
	}
	
	public void forgot_mail() throws InterruptedException
	{
		Forgot_Button.click();
		Thread.sleep(3000);
	}

}
