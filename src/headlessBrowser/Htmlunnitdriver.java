package headlessBrowser;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;



public class Htmlunnitdriver {
@Test
	public void HeadlessBrowserHtmlunit() {
		Logger logfile = Logger.getLogger("Htmlunnitdriver");
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		logfile.info("webpage open");
		
		System.out.println(driver.getTitle());
		

	}

}
