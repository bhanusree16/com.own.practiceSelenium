package dropdowns;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {

	@Test(invocationCount=2)
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
//		find an element by id and store that webelement as WebElement
		WebElement day_dropdown=driver.findElement(By.id("day"));
//		from the selected webelement dropdown opened
		Select DAY_dd = new Select(day_dropdown);
//		from that dropdown i m selecting value by visible text (3 ways are there to select)
//		1
		DAY_dd.selectByVisibleText("2");
		Thread.sleep(2000);
//		find an element by css and store that webelement as WebElement		
		WebElement month_dropdown = driver.findElement(By.cssSelector("#month"));
//		from the selected webelement dropdown opened
		Select Month_mm = new Select(month_dropdown);
//		from that dropdown i m selecting the default text webelement and store it as WebElement
		WebElement check_mnth=Month_mm.getFirstSelectedOption();
//		from the webelement geeting the text and store it as string
		String mnth_value = check_mnth.getText();
//		and i am printing the result in console
		System.out.println("BEFORE SELECTION default value "+ mnth_value);
//		again from the month dropdown i m selecting value by value
//		2
		Month_mm.selectByValue("3");
//		from 32 to 38 same steps repeated for 43 to 46
		WebElement check_mnth1=Month_mm.getFirstSelectedOption();
		String mnth_value1 = check_mnth1.getText();
		Assert.assertEquals(mnth_value1, "Mar");
		System.out.println("After SELECTION value "+ mnth_value1);
		Thread.sleep(2000);
//		from that month dropdown i m selecting value by index
//		3
		Month_mm.selectByIndex(1);
		driver.close();
	}
}
