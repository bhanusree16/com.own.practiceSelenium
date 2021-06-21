package POM_test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM_pages.Gmail_login_page;
import library.Webpage_initial;

public class gmail_login {
	@Test
	public void mail_login() throws InterruptedException
	{
		WebDriver driver = Webpage_initial.browesr_open("chrome","https://accounts.google.com/signin");
		Thread.sleep(3000);
		
		Gmail_login_page loginpage = PageFactory.initElements(driver, Gmail_login_page.class);
		
		loginpage.login_page_locators("smilybhanu62@gmail.com");
		
		loginpage.forgot_mail();
		
		Webpage_initial.browser_close();
		

	}

}
