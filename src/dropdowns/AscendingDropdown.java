package dropdowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AscendingDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
//		taking the drodown which is already in ascending order
//		1 scenario
		Select list1 = new Select(driver.findElement(By.id("tools")));
//		taking the drodown which is in random order
//		2 scenario
//		Select list1 = new Select(driver.findElement(By.id("tools1")));
		List<WebElement>values= list1.getOptions();
		List actual_list = new ArrayList();
//		store values to actual_list which is of empty as of now by using for loop
		for(WebElement val:values)  
		{ 
			String text = val.getText();
			actual_list.add(text);
		}
//		creating an emptylist 
		List temp_list = new ArrayList();
//		creating a copy of actual_list and adding all values to it
		temp_list.addAll(actual_list);
		
//		sorting temp_list in ascending order by default
		Collections.sort(temp_list);
//		sorting temp_list in descending order
//		Collections.sort(temp_list,Collections.reverseOrder());
//		asserting both actual_list and temp_list are same or not
		Assert.assertEquals(actual_list, temp_list);
		driver.quit();
		
			}

}
