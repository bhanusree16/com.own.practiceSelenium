package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act = new Actions(driver);
//		if mouse is on the element only it displays the text inside of it
		act.moveToElement(ele).perform();
		List<WebElement>elements = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		for(WebElement value:elements)
		{
			String text = value.getText();
			System.out.println(text);
			
			if(text.equals("TestNG"))
			{
				value.click();
				break;
			}
			
		}
		driver.quit();
		
	}

} 
