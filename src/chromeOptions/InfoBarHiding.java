package chromeOptions;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InfoBarHiding {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		
//		this one way  for desired capabilities
		/*
		 * DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions options = new ChromeOptions();
//		if you dont use below 2 lines you will get"chrome is controlled by automatic -----------------etc" that is infobar
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
//		if i use headless it wont show me the UI but just give the results
//		options.addArguments("--headless");
//		it will run in incognito mode
		options.addArguments("--incognito");
		options.merge(cap);
		 */
		
//		second way for desired capabilities
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
		

	}

}
