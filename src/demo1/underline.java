package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class underline {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		String underline = driver.findElement(By.xpath("//*[@class='gb_Ve']")).getCssValue("text-decoration");
		System.out.println(underline);
		
		
//		driver.get("https://www.google.co.in/?gfe_rd=ctrl&amp;ei=bXAwU8jYN4W6iAf8zIDgDA&amp;gws_rd=cr");

		 String cssValue= driver.findElement(By.xpath("//*[text()='हिन्दी']")).getCssValue("text-decoration");

		 System.out.println("value "+cssValue);

		 Actions act = new Actions(driver);

		 act.moveToElement(driver.findElement(By.xpath("//*[text()='हिन्दी']"))).perform();

		 String cssValue1= driver.findElement(By.xpath("//*[text()='हिन्दी']")).getCssValue("text-decoration");

		 System.out.println("value over "+cssValue1);

		 driver.close();

	}

}
