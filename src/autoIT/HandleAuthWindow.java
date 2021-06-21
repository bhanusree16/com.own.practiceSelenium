package autoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthWindow {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Set the username
		String username = "admin";
		
		//Set the password
		String password = "admin";
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
//		or
//		SYNTAX is  http://username:password@website.com
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		Runtime.getRuntime().exec("C:\\eclipse\\AutoIt\\scripts\\AuthWindow.exe");
		
		Thread.sleep(3000);
		driver.quit();
	}


}
