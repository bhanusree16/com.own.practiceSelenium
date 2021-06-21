package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class waitfor {

//	inplace of Thread.sleep(it is not the good way in programming)for page load we use element to be visible and element to be clickable 
	public static WebElement waitforelementvisible(WebDriver driver,WebElement element, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, sec);
		WebElement webelement = wait.until(ExpectedConditions.visibilityOf(element));
		return webelement;
	}
	
	public static WebElement waitforelementclick(WebDriver driver,WebElement element,int sec)
	{
		WebDriverWait wait = new WebDriverWait(driver, sec);
		WebElement webelement = wait.until(ExpectedConditions.elementToBeClickable(element));
		
		return webelement;
	}

}
