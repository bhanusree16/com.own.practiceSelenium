package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>list=driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(int i=0;i<list.size();i++) {
			WebElement checkbox=list.get(i);
			String name = checkbox.getAttribute("id");
			if(name.equals("code"))
			{
				checkbox.click();
			}
			
		}

	}

}
