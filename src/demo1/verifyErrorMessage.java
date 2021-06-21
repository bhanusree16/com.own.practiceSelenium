package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class verifyErrorMessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Gmail"));
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		String err_msg=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		System.out.println(err_msg);
		Assert.assertEquals(err_msg, "Enter an email or phone number");
		driver.quit();
		
		

	}

}
