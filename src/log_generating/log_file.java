package log_generating;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class log_file {

	public static void main(String[] args) throws InterruptedException {
		Logger logFile=Logger.getLogger("log_file");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		logFile.info("WEBPAGE OPEN");
		
		driver.manage().window().maximize();
		logFile.info("maximized");
		
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		logFile.info("SEARCH DONE");
		
		driver.findElement(By.xpath("(//cite[text()='https://www.selenium.dev'])[1]")).click();
		logFile.info("given results");
		
		driver.quit();

	}

}
