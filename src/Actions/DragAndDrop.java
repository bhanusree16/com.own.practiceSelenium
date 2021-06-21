package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		/**
		 * this particular webelement xpath is not working ...infact it is not working for any other xpaths also
		 */
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		int count= driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		WebElement framename= driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(framename);
		WebElement framename1= driver.findElement(By.xpath("//iframe[@class='st-preview-body']"));
		driver.switchTo().frame(framename1);
		WebElement framename2= driver.findElement(By.xpath("//iframe[@id='content']"));
		driver.switchTo().frame(framename2);
		WebElement sorce=driver.findElement(By.xpath("//*[text()='Horror']"));
		WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		act.dragAndDrop(sorce, dest).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}

//Hi mukesh, i have tried to drag and drop with "https://dhtmlx.com/docs/products/dhtmlxTree/" but in starting itself throwing exception(Nosuchelementexception) with whatever the element  i took,and i have a doubt that the we want to drag is in an iframe but in the video you didn't switch to iframe but your code worked but in my case with chrome driver inspite of i used iframes also continuously throwing the error for the respective xpaths i used.