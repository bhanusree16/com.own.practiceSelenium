package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase {
	
	library_Repository lib;
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		lib = new library_Repository();
		System.setProperty("webdriver.chrome.driver", lib.get_chrome_path());
		driver = new ChromeDriver();
//		rather than printinng in console i use reporter.log and say true ...it will print in my console and report file also
//		if i make it as false it only prints in report not in console
		Reporter.log("===========setup ready=============", true);
			}
	
	
	@Test
	public void testchrome()
	{
		Reporter.log("=======test started=======",true);
		driver.get(lib.get_automation_url());
		
	}
	
	@AfterTest
	public void driver_close()
	{
		Reporter.log("=====driver close=====",true);
		driver.quit();
	}

}
