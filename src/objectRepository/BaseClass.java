package objectRepository;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import library.Webpage_initial;

public class BaseClass {
	library_Repository lib;
	WebDriver driver;
	
	@BeforeMethod
//	@BeforeTest
	public void setup()
	{
		lib = new library_Repository();
		driver = Webpage_initial.browesr_open("chrome", lib.get_wordpress_url());
//		rather than printinng in console i use reporter.log and say true ...it will print in my console and in report file also
//		if i make it as false it only prints in report not in console
		Reporter.log("===========setup ready=============", true);
			}
	
	@AfterMethod
//	@AfterTest
	public void driver_close()
	{
		driver.quit();
		Reporter.log("=====driver close=====",true);
	}

}
