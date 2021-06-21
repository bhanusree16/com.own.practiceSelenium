package tableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//*[text()='Onward Date']")).click();
		List<WebElement>dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//td"));
		for(WebElement date:dates)
		{
			String travel_date=date.getText();
			System.out.println(travel_date);
			if(travel_date.contains("3"))
			{
				date.click();
				break;
			}
		}
		driver.quit();
		
	}

}
