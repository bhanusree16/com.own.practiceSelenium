/**
 * 
 */
package POM_test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM_pages.LoginPage;
import POM_pages.MyHomePage;

/**
 * @author jagan
 * 
 * this is my testcase for wordpress login
 *
 */
public class WordpressLogin {
	
	@Test
	public void wordpress_login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		LoginPage login = new LoginPage(driver);
		MyHomePage homepage = new MyHomePage(driver);
		login.loginpage("bhanu12reddy","sareddy@123");
		homepage.homePage();
		driver.quit();
		
	}

}
