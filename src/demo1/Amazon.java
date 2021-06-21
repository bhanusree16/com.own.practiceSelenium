package demo1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		String parent_tab = driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("t-shirt",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//a[text()='Price: Low to High'])[1]")).click();
		driver.findElement(By.xpath("//*[text()='Stylish Mens and Boys Casual wear Dry Fit Plain Round Neck T-Shirt']")).click();
		Thread.sleep(10000);
		Set<String>all_windows = driver.getWindowHandles();
		for(String child:all_windows)
		{
			if(!child.endsWith(parent_tab))
			{
		driver.switchTo().window(child);
		WebElement dropdown = driver.findElement(By.id("native_dropdown_selected_size_name"));
		Select dropdown_value = new Select(dropdown);
		dropdown_value.selectByVisibleText("S");;
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.close();
		}
		}
		driver.quit();  
		
		

	}

}
