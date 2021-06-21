  package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParallelBrowser {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browsername) throws InterruptedException
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 Thread.sleep(5000);
		}
		else if (browsername.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}

	}
	
	@Test
	public void Multi_browsers()
	{
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.getCurrentUrl();
		driver.quit();
	}

}
