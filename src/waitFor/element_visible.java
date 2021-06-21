package waitFor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import library.Webpage_initial;
import library.waitfor;

public class element_visible {
	@Test
	public void visible()
	{
		WebDriver driver = Webpage_initial.browesr_open("chrome", "https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
//		inplace of Thread.sleep(it is not the good way in programming)for page load we use element to be visible and element to be clickable 
		waitfor.waitforelementclick(driver, search, 5).sendKeys("hi");
		WebElement search_button = driver.findElement(By.name("btnK"));
		waitfor.waitforelementclick(driver, search_button, 5);
		driver.quit();
		
	}

}
