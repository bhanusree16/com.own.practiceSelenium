package IFrames_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		String parent_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[text()='Terms']")).click();
		System.out.println(driver.getTitle());
		Set<String> ALL_windows=driver.getWindowHandles();
		for(String child:ALL_windows)
		{
			if(!child.equals(parent_window))
			{
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.quit();

	}

}
