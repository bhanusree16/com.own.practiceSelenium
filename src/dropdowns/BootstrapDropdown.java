package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		
		driver.findElement(By.cssSelector("#menu1")).click();;
		List<WebElement>dropdown=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		
		for(WebElement value:dropdown)
		{
		String text = value.getText();
//		or
//		String text = value.getAttribute("innerHTML");	
		if(text.equals("JavaScript"))
		{
			value.click();
			break;
		}
		System.out.println(text);
		}
		driver.quit();
		

	}

}
