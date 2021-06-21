package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AscendingDropdown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
//		taking the drodown which is already in ascending order
//		1 scenario
		List<WebElement>list1 = driver.findElements(By.xpath("//select[@id='tools']//option"));
//		
		for(WebElement val:list1)
		{
			String text = val.getText();
			
			if(text.equalsIgnoreCase("Docker")) {
				val.click();
				break;
			}
			
		}

			}

}
