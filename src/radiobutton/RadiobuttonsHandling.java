package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
//		get all radiobuttions and save them in list format
		List<WebElement>list =driver.findElements(By.cssSelector("input[type='radio']"));
		for(int i=0;i<list.size();i++)
		{
//			we get all radio buttons
			WebElement radio=list.get(i);
//		we get all radio button names	
			String name =radio.getAttribute("id");
			System.out.println(name);
			if (name.equals("java"))
			{
				radio.click();
				
			}
		}
		

	}

}
