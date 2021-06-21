package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import library.waitfor;

public class scrolinto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("(//img[@src='images/img4.jpg'])[1]"));
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mCSB_3_container\"]/p[4]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		waitfor.waitforelementvisible(driver, element, 5);
		System.out.println(element.getText());
		js.executeScript("arguments[0].scrollIntoView(true)", element1);
		waitfor.waitforelementvisible(driver, element1, 5);
		System.out.println(element1.getText());
//		Thread.sleep(4000);
		
		
		driver.quit();

	}

}
