package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\eclipse\\javaJars\\iframe_HTML\\fileupload.html");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//*[@id='1']"));
		System.out.println(element.getText());
//		click operation is not working for the xpath
//		element.click();
		
//		because the click option is not working i used actions class for performing click and it is working
		Actions builder = new Actions(driver);
        builder.moveToElement(element).click(element);
        builder.perform();
//        after this i should wait for sometime otherwise it won't upload the file
        Thread.sleep(3000);
        
		System.out.println("clicked successfully");
//		to choose the external file use below methods
		Runtime.getRuntime().exec("C:\\eclipse\\AutoIt\\scripts\\fileopen.exe");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
