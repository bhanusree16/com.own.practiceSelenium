package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webpage_initial {
	static WebDriver driver;
	
	public static WebDriver browesr_open(String browser_name,String url) {
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browser_name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:/eclipse/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;

	}
	
	public static void browser_close()
	{
		driver.quit();
	}

}
